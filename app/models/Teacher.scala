package models

import scala.slick.direct.AnnotationMapper.column

import play.api.db.slick.Config.driver.simple._

case class PersonalDataT(id: Option[Int],
                      name:String,
                      surname:String,
                      secondname: String,

                      dateofbirth :String,

                      passportSeries:String,
                      role:String,
                      department:String,
                      livingPlace:String)

class PersonalDataTableT(tag: Tag) extends Table[PersonalDataT](tag, "Teachers"){
  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)
  def name = column[String]("NAME", O.Default(""))
  def surname = column[String]("SURNAME", O.Default(""))
  def secondname = column[String]("SECONDNAME", O.Default(""))

  def dateofbirth  = column[String]("DATEOFBIRTH", O.Default(""))

  def passportSeries = column[String]("PASSPORTSERIES", O.Default(""))
  def role = column[String]("ROLE", O.Default(""))
  def department = column[String]("DEPARTMENT", O.Default(""))
  def livingPlace = column[String]("LIVINGPLACE", O.Default(""))

  def * = (id.?, name, surname, secondname, dateofbirth , passportSeries, role, department, livingPlace) <> (PersonalDataT.tupled, PersonalDataT.unapply _)

}
case class FamilyMembersT()
class FamilylMembersTableT()
