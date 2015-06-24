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
  val personalDataT=TableQuery[PersonalDataTableT]

  def teachersList = DBAction { implicit rs =>
    Logger.info(s"SHOW_ALL = ${personalDataT.list}")
    Ok(views.html.teacherList(personalDataT.list))
  }
  def showAddForm = Action {
    Ok(views.html.addTeacher())
  }

  def addTeachers = DBAction { implicit request =>
    val formParams = request.body.asFormUrlEncoded
    val name = formParams.get("name")(0)
    val surname = formParams.get("name")(0)
    val secondname = formParams.get("name")(0)
    val dateofbirth  = formParams.get("day")(0)
    val passportSeries = formParams.get("passportSeries")(0)
    val role = formParams.get("role")(0)
    val department = formParams.get("department")(0)
    val livingPlace = formParams.get("livingPlace")(0)

    val teacherId = (personalDataT returning personalDataT.map(_.id)) += PersonalDataT(None, name, surname, secondname,
      dateofbirth , passportSeries, role, department, livingPlace)
    Logger.info(s"LastId = $teacherId")
    Redirect(routes.Teachers.teachersList())
  }


  def remove(id: Int) = DBAction { implicit request =>
    personalDataT.filter(_.id === id).delete;
    Redirect(routes.Teachers.teachersList())
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

    val teacher = PersonalDataT(Some(id), name, surname, secondname, dateofbirth, passportSeries, role, department, livingPlace)
    personalDataT.filter(_.id === id).update(teacher)

    Redirect(routes.Teachers.teachersList())
  }

//  def showEditForm(teacherId: Int) = DBAction { implicit request =>
//    val byId = personalDataT.findBy(_.id)
//    val teacher = byId(teacherId).list.head
//
//    Ok(views.html.OqituvchiAnketasi(teacher))
//  }

}