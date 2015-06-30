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

  def showAddForm = DBAction { implicit rs =>
    Ok(views.html.addStudent())
  }

  def addStudents = DBAction { implicit request =>
    val formParams = request.body.asFormUrlEncoded
    val ismi = formParams.get("ismi")(0)
    val familiyasi = formParams.get("familiyasi")(0)
    val otasining_ismi = formParams.get("otasining_ismi")(0)
    val tugulgan_sana = formParams.get("tugulgan_sana")(0)
    val guruhi = formParams.get("guruhi")(0)
    val elektron_pochtasi = formParams.get("elektron_pochtasi")(0)
    val tel = formParams.get("tel")(0)

    val studentId = (personalDataS returning personalDataS.map(_.id)) += PersonalDataS(None, ismi, familiyasi, otasining_ismi, tugulgan_sana, guruhi, elektron_pochtasi, tel)
    Redirect(routes.Students.studentsList())
  }


  def remove(id: Int) = DBAction { implicit request =>
    personalDataS.filter(_.id === id).delete;
    Redirect(routes.Students.studentsList())
  }


}
