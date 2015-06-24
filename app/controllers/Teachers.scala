package controllers

import play.api.mvc._
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._
import models._
import play.api.Logger
import play.api.libs.json.Json._
import play.api.libs.json.Json

import scala.slick.lifted.TableQuery
class Teachers extends Controller{
  val oqituvchilar=TableQuery[shahsiyTable]

  def oqituvchiList = DBAction { implicit rs =>
    Logger.info(s"SHOW_ALL = ${oqituvchilar.list}")
    Ok(views.html.OqituvchilarRoyhati(oqituvchilar.list))
  }


  def addOqit = DBAction { implicit request =>
    val formParams = request.body.asFormUrlEncoded
    val name = formParams.get("name")(0)
    val surname = formParams.get("name")(0)
    val secondname = formParams.get("name")(0)
    val dateofbirth  = formParams.get("day")(0)
    val passportSeries = formParams.get("passportSeries")(0)
    val role = formParams.get("role")(0)
    val department = formParams.get("department")(0)
    val livingPlace = formParams.get("livingPlace")(0)


    val oqitId = (oqituvchilar returning oqituvchilar.map(_.id)) += shahsiyMal(None, name, surname, secondname,
      dateofbirth , passportSeries, role, department, livingPlace)
    Logger.info(s"LastId = $oqitId")
    Redirect(routes.Teachers.oqituvchiList())
  }


  def remove(id: Int) = DBAction { implicit request =>
    oqituvchilar.filter(_.id === id).delete;
    Redirect(routes.Teachers.oqituvchiList())
  }

  def update(id: Int) = DBAction { implicit rs =>
    val formParams = rs.body.asFormUrlEncoded
    val name = formParams.get("name")(0)
    val surname = formParams.get("name")(0)
    val secondname = formParams.get("name")(0)
    val dateofbirth  = formParams.get("day")(0)
    val passportSeries = formParams.get("passportSeries")(0)
    val role = formParams.get("role")(0)
    val department = formParams.get("department")(0)
    val livingPlace = formParams.get("livingPlace")(0)

    val oqituvchi = shahsiyMal(Some(id), name, surname, secondname, dateofbirth, passportSeries, role, department, livingPlace)
    oqituvchilar.filter(_.id === id).update(oqituvchi)

    Redirect(routes.Teachers.oqituvchiList())
  }

  def showEditForm(oqitId: Int) = DBAction { implicit request =>
    val byId = oqituvchilar.findBy(_.id)
    val oqit = byId(oqitId).list.head

    Ok(views.html.OqituvchiAnketasi(oqit))
  }

}