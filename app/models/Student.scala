package models

//import scala.slick.profile.RelationalTableComponent.Table
import play.api.db.slick.Config.driver.simple._

/**
 * Created by Eldorbek on 19.06.2015.
 */
case class talabalar(id: Option[Int],
                     ismi: String,
                     familiyasi: String,
                     otasining_ismi: String,
                     tugulgan_sana: String,
                     guruhi: String,
                     elektron_pochtasi: String,
                     tel: String)
class TalabalarQushish(tag: Tag) extends Table[talabalar](tag, "Talabalar") {

  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)

  def ismi = column[String]("ismi", O.Default(""))

  def familiyasi = column[String]("familiyasi", O.Default(""))

  def otasining_ismi = column[String]("otasining_ismi", O.Default(""))

  def tugulgan_sana = column[String]("tugulgan_sana", O.Default(""))

  def guruhi = column[String]("guruhi", O.Default(""))

  def elektron_pochtasi = column[String]("email", O.Default(""))

  def tel = column[String]("tel", O.Default(""))

  def * = (id.?, ismi, familiyasi , otasining_ismi,tugulgan_sana,guruhi, elektron_pochtasi, tel) <>(talabalar.tupled, talabalar.unapply _)

}

