package controllers


import play.api.mvc._
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._
import models._
import play.api.Logger

import scala.slick.lifted.TableQuery


class Malumot extends Controller {

  val malumotlar = TableQuery[TalabalarQushish]

  def list = DBAction { implicit rs =>
    Logger.info(s"SHOW_ALL = ${malumotlar.list}")

    Ok(views.html.talabalar_royhati(malumotlar.list))
  }


  def showAddForm = Action {
    Ok(views.html.talabalar_qushish())
  }

  def registr = DBAction { implicit i =>
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
    val UserId = (malumotlar returning malumotlar.map(_.id)) += talabalar(None, ismi, familiyasi, otasining_ismi, tugulgan_sana, guruhi, elektron_pochtasi, tel)
    Redirect(routes.Malumot.list())
  }


  def ochirish(id: Int) = DBAction { implicit request =>
    malumotlar.filter(_.id === id).delete;
    Redirect(routes.Malumot.list())
  }

}
