package models

//import scala.slick.profile.RelationalTableComponent.Table
import play.api.db.slick.Config.driver.simple._

/**
 * Created by Eldorbek on 19.06.2015.
 */
case class talabalar(id: Option[Int],
                     name: String,
                     surname: String,
                     second_name: String,
                     tugulgan_sana: String,
                     guruhi: String,
                     email: String,
                     tel: String)
class TalabalarRegistr(tag: Tag) extends Table[talabalar](tag, "Talabalar") {

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def name = column[String]("name", O.Default(""))

  def surname = column[String]("surname", O.Default(""))

  def second_name = column[String]("second_name", O.Default(""))

  def tugulgan_sana = column[String]("tugulgan_sana", O.Default(""))

  def guruhi = column[String]("guruhi", O.Default(""))

  def email = column[String]("email", O.Default(""))

  def tel = column[String]("tel", O.Default(""))

  def * = (id.?, name, surname, second_name,tugulgan_sana,guruhi, email, tel) <>(talabalar.tupled, talabalar.unapply _)

}

