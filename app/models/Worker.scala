package models

/**
 * Created by Doston on 18.06.2015.
 */

import play.api.db.slick.Config.driver.simple._


case class PersonalDataW(id: Option[Int],
                 First_name: String,
                 Last_name: String,
                 Second_name: String,
                 Department: String,
                 Commission: String,
                 Birthday: String,
                 Education: String,
                 Nationality: String,
                 Sex: String,
                 Marital_status: String,
                 Country: String,
                 Region: String,
                 District: String,
                 Address: String,
                 Tel_number: String,
                 Fax: String,
                 Mail_address: String,
                 Passport_series: String,
                 Passport_number: Int,
                 Country_of_birth: String,
                 Who_is_given_by: String
//                 Issue_date: String,
//                 Term_of_validity: String,
//                 Citizenship: String,
//                 Recruitment_year: String,
//                 Resignation_year: String,
//                 Organization: String,
//                 Relatives: String,
//                 Father_name: String,
//                 Father_surname: String,
//                 Father_second_name: String,
//                 Father_nationality: String,
//                 Mother_name: String,
//                 Mother_surname: String,
//                 Mother_second_name: String,
//                 Mother_nationality: String,
//                 Part_time_job: Double,
//                 Which_language_know: String,
//                 What_extend_know: String
                 )


class PersonalDataTableW(tag: Tag) extends  Table[PersonalDataW](tag, "Workers"){

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def First_name = column[String]("FIRST_NAME", O.Default(""))

  def Last_name = column[String]("LAST_NAME", O.Default(""))

  def Second_name = column[String]("SECOND_NAME", O.Default(""))

  def Department = column[String]("DEPARTMENT", O.Default(""))

  def Commission = column[String]("COMMISSION", O.Default(""))

  def Birthday = column[String]("BIRTHDAY", O.Default(""))

  def Education = column[String]("EDUCATION", O.Default(""))

  def Nationality = column[String]("NATIONALITY", O.Default(""))

  def Sex = column[String]("SEX", O.Default(""))

  def Marital_status = column[String]("MARITAL_STATUS", O.Default(""))

  def Country = column[String]("COUNTRY", O.Default(""))

  def Region = column[String]("REGION", O.Default(""))

  def District = column[String]("DISTRICT", O.Default(""))

  def Address = column[String]("ADDRESS", O.Default(""))

  def Tel_number = column[String]("TEL_NUMBER", O.Default(""))

  def Fax = column[String]("FAX", O.Default(""))

  def Mail_address = column[String]("MAIL_ADDRESS", O.Default(""))

  def Passport_series = column[String]("PASSPORT_SERIES", O.Default(""))

  def Passport_number = column[Int]("PASSPORT_NUMBER")

  def Country_of_birth = column[String]("COUNTRY_OF_BIRTH", O.Default(""))

  def Who_is_given_by = column[String]("WHO_IS_GIVEN_BY", O.Default(""))

//  def Issue_date = column[String]("ISSUE_DATE", O.Default(""))
//
//  def Term_of_validity = column[String]("TERM_OF_VALIDITY", O.Default(""))
//
//  def Citizenship = column[String]("CITIZENSHIP", O.Default(""))
//
//  def Recruitment_year = column[String]("RECRUITMENT_YEAR", O.Default(""))
//
//  def Resignation_year = column[String]("RESIGNATION_YEAR", O.Default(""))
//
//  def Organization = column[String]("ORGANIZATION", O.Default(""))
//
//  def Relatives = column[String]("RELATIVES", O.Default(""))
//
//  def Father_name = column[String]("FATHER_NAME", O.Default(""))
//
//  def Father_surname = column[String]("FATHER_SURNAME", O.Default(""))
//
//  def Father_second_name = column[String]("FATHER_SECOND_NAME", O.Default(""))
//
//  def Father_nationality = column[String]("FATHER_NATIONALITY", O.Default(""))
//
//  def Mother_name = column[String]("MOTHER_NAME", O.Default(""))
//
//  def Mother_surname = column[String]("MOTHER_SURNAME", O.Default(""))
//
//  def Mother_second_name = column[String]("MOTHER_SECOND_NAME", O.Default(""))
//
//  def Mother_nationality = column[String]("MOTHER_NATIONALITY", O.Default(""))
//
//  def Part_time_job = column[Double]("PART_TIME_JOB")
//
//  def Which_language_know = column[String]("WHICH_LANGUAGE_KNOW", O.Default(""))
//
//  def What_extend_know = column[String]("WHAT_EXTEND_KNOW", O.Default(""))

  def * = (id.?, First_name, Last_name, Second_name, Department, Commission, Birthday, Education, Nationality, Sex, Marital_status, Country, Region, District, Address, Tel_number, Fax, Mail_address, Passport_series, Passport_number, Country_of_birth, Who_is_given_by
//    , Issue_date, Term_of_validity, Citizenship, Recruitment_year, Resignation_year, Organization, Relatives, Father_name, Father_surname, Father_second_name, Father_nationality, Mother_name, Mother_surname, Mother_second_name, Mother_nationality, Part_time_job, Which_language_know, What_extend_know
  ) <> (PersonalDataW.tupled, PersonalDataW.unapply _)

}