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
                 Who_is_given_by: String,
                 Issue_date: String,
                 Term_of_validity: String,
                 Citizenship: String,
                 Recruitment_year: String,
                 Resignation_year: String,
                 Organization: String,
                 Relatives: String,
                 Father_name: String,
                 Father_surname: String,
                 Father_second_name: String,
                 Father_nationality: String,
                 Mother_name: String,
                 Mother_surname: String,
                 Mother_second_name: String,
                 Mother_nationality: String
                 )


class PersonalDataTableW(tag: Tag) extends  Table[PersonalDataW](tag, "Workers"){

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def First_name = column[String]("FIRST_NAME", O.Default(""))

  def Last_name = column[String]("LAST_NAME", O.Default(""))

  def Second_name = column[String]("SECOND_NAME", O.Default(""))

  def Department = column[String]("DEPARTMENT", O.Default(""))

  def Commission = column[String]("COMMISSION", O.Default(""))

  def Birthday = column[String]("BIRTHDAY", O.Default(""))

  def * = (id.?, First_name, Last_name, Second_name, Department, Commission, Birthday) <> (PersonalDataW.tupled, PersonalDataW.unapply _)

}
case class FamilyMembersW()
class FamilyMembersTableW()

object forinc{
  var t1=false
  def y1: Unit ={
    t1=true
    t1
  }
  var t2=false
  def y2: Unit ={
    t2=true
    t2
  }
  var t3=false
  def y3: Unit ={
    t3=true
    t3
  }
}
