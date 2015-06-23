package controllers

/**
 * Created by Doston on 19.06.2015.
 */

import play.api.mvc._
import play.api.db.slick._
import play.api.db.slick.Config.driver.simple._
import models._
import play.api.Logger

import scala.slick.lifted.TableQuery


class Hodimlar extends Controller{

  val hodim_table = TableQuery[HodimTable]

  def hamma_hodimlar = DBAction { implicit rs =>
    Logger.info(s"SHOW_ALL = ${hodim_table.list}")
    Ok(views.html.XodimlarRoyhati(hodim_table.list))
  }

  def showAddForm = Action {
    Ok(views.html.Xodimlar())
  }

  def add = DBAction { implicit request =>
    val formParams = request.body.asFormUrlEncoded
    val First_name = formParams.get("First_name")(0)
    val Last_name = formParams.get("Last_name")(0)
    val Second_name = formParams.get("Second_name")(0)
    val Department = formParams.get("Department")(0)
    val Commission = formParams.get("Commission")(0)
    val Birthday = formParams.get("Birthday")(0)

    val hodimId = (hodim_table returning hodim_table.map(_.id)) += Hodim(None, First_name, Last_name, Second_name, Department, Commission, Birthday)
    Redirect(routes.Hodimlar.hamma_hodimlar())
  }

  def remove(id: Int) = DBAction { implicit request =>
    hodim_table.filter(_.id === id).delete
    Redirect(routes.Hodimlar.hamma_hodimlar())
  }

}
