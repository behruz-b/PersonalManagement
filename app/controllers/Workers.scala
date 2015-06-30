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
    val Education = formParams.get("Education")(0)
    val Nationality = formParams.get("Nationality")(0)
    val Sex = formParams.get("Sex")(0)
    val Marital_status = formParams.get("Marital_status")(0)
    val Country = formParams.get("Country")(0)
    val Region = formParams.get("Region")(0)
    val District = formParams.get("District")(0)
    val Address = formParams.get("Address")(0)
    val Tel_number = formParams.get("Tel_number")(0)
    val Fax = formParams.get("Fax")(0)
    val Mail_address = formParams.get("Mail_address")(0)
    val Passport_series = formParams.get("Passport_series")(0)
    val Passport_number = formParams.get("Passport_number")(0)
    val Country_of_birth = formParams.get("Country_of_birth")(0)
    val Who_is_given_by = formParams.get("Who_is_given_by")(0)
//    val Issue_date = formParams.get("Issue_date")(0)
//    val Term_of_validity = formParams.get("Term_of_validity")(0)
//    val Citizenship = formParams.get("Citizenship")(0)
//    val Recruitment_year = formParams.get("Recruitment_year")(0)
//    val Resignation_year = formParams.get("Resignation_year")(0)
//    val Organization = formParams.get("Organization")(0)
//    val Relatives = formParams.get("Relatives")(0)
//    val Father_name = formParams.get("Father_name")(0)
//    val Father_surname = formParams.get("Father_surname")(0)
//    val Father_second_name = formParams.get("Father_second_name")(0)
//    val Father_nationality = formParams.get("Father_nationality")(0)
//    val Mother_name = formParams.get("Mother_name")(0)
//    val Mother_surname = formParams.get("Mother_surname")(0)
//    val Mother_second_name = formParams.get("Mother_second_name")(0)
//    val Mother_nationality = formParams.get("Mother_nationality")(0)

    val workerId = (personalDataW returning personalDataW.map(_.id)) += PersonalDataW(None, First_name, Last_name, Second_name, Department, Commission, Birthday, Education, Nationality, Sex, Marital_status, Country, Region, District, Address, Tel_number, Fax, Mail_address, Passport_series, Passport_number.toInt, Country_of_birth, Who_is_given_by)
//      , Issue_date, Term_of_validity, Citizenship, Recruitment_year, Resignation_year, Organization, Relatives, Father_name, Father_surname, Father_second_name, Father_nationality, Mother_name, Mother_surname, Mother_second_name, Mother_nationality, Part_time_job.toDouble, Which_language_know, What_extend_know)
    Redirect(routes.Workers.workersList())
  }

  def remove(id: Int) = DBAction { implicit request =>
    personalDataW.filter(_.id === id).delete
    Redirect(routes.Workers.workersList())
  }

}
