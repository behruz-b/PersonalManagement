package controllers





import play.api.mvc._
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._
import models._
import play.api.Logger

import scala.slick.lifted.TableQuery


class Malumot  extends Controller{

  val malumotlar = TableQuery[TalabalarRegistr]

  def list = DBAction { implicit rs =>
    Logger.info(s"SHOW_ALL = ${malumotlar.list}")

    Ok(views.html.talabalar_list(malumotlar.list))
  }


  def showAddForm = Action {
    Ok(views.html.talabalar_registr())
  }

  def registr = DBAction { implicit i =>
    val set = i.body.asFormUrlEncoded
    val name = set.get("name")(0)
    val surname = set.get("surname")(0)
    val second_name = set.get("second_name")(0)
    val tugulgan_sana = set.get("tugulgan_sana")(0)
    val guruhi = set.get("guruhi")(0)

    val email = set.get("email")(0)
    val tel = set.get("tel")(0)

    println("Name: " + name)
    println("Name: " + name)
    val UserId = (malumotlar returning malumotlar.map(_.id)) += talabalar(None, name, surname,second_name,tugulgan_sana,guruhi ,email,tel)
    Redirect(routes.Malumot.list())
  }


  def remove(id: Int) = DBAction { implicit request =>
    malumotlar.filter(_.id === id).delete;
    Redirect(routes.Malumot.list())
  }
//  def profil=Action{
//    Ok(views.html.profil("Eldor"))
//  }
//  def proba=Action{
//    Ok(views.html.proba("Eldorbek"))
//  }
}
