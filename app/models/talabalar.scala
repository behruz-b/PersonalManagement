package models

//import scala.slick.profile.RelationalTableComponent.Table
import play.api.db.slick.Config.driver.simple._

/**
 * Created by Eldorbek on 19.06.2015.
 */
case class talabalar(id: Option[Int],
                     name: String,
                     surname: String,
                     email: String,
                     login: String,
                     parol: String)
class TalabalarRegistr(tag: Tag) extends Table[talabalar](tag, "Users") {

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def name = column[String]("name", O.Default(""))

  def surname = column[String]("surname", O.Default(""))

  def email = column[String]("email", O.Default(""))

  def login = column[String]("login", O.Default(""))

  def parol = column[String]("parol", O.Default(""))

  def * = (id.?, name, surname, email, login, parol) <>(talabalar.tupled, talabalar.unapply _)

}

