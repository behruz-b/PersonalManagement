package models

import play.api.db.slick.Config.driver.simple._

case class PersonalDataT(id: Option[Int],
                      name: String,
                      surname: String,
                      secondName: String,
                      dateOfBirth: String,
                      passportSeries: String,
                      role: String,
                      department: String,
                      livingPlace: String)

class PersonalDataTableT(tag: Tag) extends Table[PersonalDataT](tag, "Teachers"){

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def name = column[String]("name", O.Default(""))

  def surname = column[String]("surname", O.Default(""))

  def secondName = column[String]("secondName", O.Default(""))

  def dateOfBirth  = column[String]("dataOfBirth", O.Default(""))

  def passportSeries = column[String]("passportSeries", O.Default(""))

  def role = column[String]("role", O.Default(""))

  def department = column[String]("department", O.Default(""))

  def livingPlace = column[String]("livingPlace", O.Default(""))

  def * = (id.?, name, surname, secondName, dateOfBirth , passportSeries, role, department, livingPlace) <> (PersonalDataT.tupled, PersonalDataT.unapply _)

}
//case class FamilyMembersT()
//class FamilylMembersTableT()
