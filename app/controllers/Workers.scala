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


class Workers extends Controller{

  val personalDataW = TableQuery[PersonalDataTableW]

  def workersList = DBAction { implicit rs =>
    Logger.info(s"SHOW_ALL = ${personalDataW.list}")
    Ok(views.html.workersList(personalDataW.list))
  }

  def showAddForm = Action {
    Ok(views.html.addWorker())
  }

  def addWorkers = DBAction { implicit request =>
    val formParams = request.body.asFormUrlEncoded
    val First_name = formParams.get("First_name")(0)
    val Last_name = formParams.get("Last_name")(0)
    val Second_name = formParams.get("Second_name")(0)
    val Department = formParams.get("Department")(0)
    val Commission = formParams.get("Commission")(0)
    val Birthday = formParams.get("Birthday")(0)

    val workerId = (personalDataW returning personalDataW.map(_.id)) += PersonalDataW(None, First_name, Last_name, Second_name, Department, Commission, Birthday)
    Redirect(routes.Workers.workersList())
  }

  def remove(id: Int) = DBAction { implicit request =>
    personalDataW.filter(_.id === id).delete
    Redirect(routes.Workers.workersList())
  }

}
