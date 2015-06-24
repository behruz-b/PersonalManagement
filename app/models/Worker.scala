package models

/**
 * Created by Doston on 18.06.2015.
 */

import play.api.db.slick.Config.driver.simple._


case class Hodim(id: Option[Int],
                 First_name: String,
                 Last_name: String,
                 Second_name: String,
                 Department: String,
                 Commission: String,
                 Birthday: String)

case class FamilyMembers()

case class About()

class HodimTable(tag: Tag) extends  Table[Hodim](tag, "Hodimlar"){

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def First_name = column[String]("FIRST_NAME", O.Default(""))

  def Last_name = column[String]("LAST_NAME", O.Default(""))

  def Second_name = column[String]("SECOND_NAME", O.Default(""))

  def Department = column[String]("DEPARTMENT", O.Default(""))

  def Commission = column[String]("COMMISSION", O.Default(""))

  def Birthday = column[String]("BIRTHDAY", O.Default(""))

  def * = (id.?, First_name, Last_name, Second_name, Department, Commission, Birthday) <> (Hodim.tupled, Hodim.unapply _)

}
