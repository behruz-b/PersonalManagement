package controllers
import models._
import play.api.Logger
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._
import play.api.mvc._
import scala.slick.lifted.TableQuery
class Students extends Controller{
  val personalDataS = TableQuery[PersonalDataTableS]

  def studentsList = DBAction { implicit rs =>
    Logger.info(s"SHOW_ALL = ${personalDataS.list}")

    Ok(views.html.studentsList(personalDataS.list))
  }


  def showAddForm = Action {
    Ok(views.html.addStudent())
  }

  def addStudents = DBAction { implicit i =>
    val set = i.body.asFormUrlEncoded
    val ismi = set.get("ismi")(0)
    val familiyasi = set.get("familiyasi")(0)
    val otasining_ismi = set.get("otasining_ismi")(0)
    val tugulgan_sana = set.get("tugulgan_sana")(0)
    val guruhi = set.get("guruhi")(0)
    val elektron_pochtasi = set.get("elektron_pochtasi")(0)
    val tel = set.get("tel")(0)

    println("Name: " + ismi)
    println("Name: " + ismi)
    val studentId = (personalDataS returning personalDataS.map(_.id)) += PersonalDataS(None, ismi, familiyasi, otasining_ismi, tugulgan_sana, guruhi, elektron_pochtasi, tel)
    Redirect(routes.Students.studentsList())
  }


  def remove(id: Int) = DBAction { implicit request =>
    personalDataS.filter(_.id === id).delete;
    Redirect(routes.Students.studentsList())
  }


}
