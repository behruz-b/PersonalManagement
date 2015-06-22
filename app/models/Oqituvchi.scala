package models

//import sun.security.krb5.internal.ccache.Tag
//
////import play.api.db.slick.Config.driver.simple._

case class shahsiyMalumoti(id: Option[Int],
                      name:String,
                      surname:String,
                      secondname: String,

                      day:String,
                      month:String,
                      year:String,

                      passportSeries:String,
                      role:String,
                      department:String,
                      livingPlace:String)

case class oilaviyMal()

case class Malumoti()

case class oqituvchilarUchun()

//class shahsiyTable(tag: Tag) extends Table[shahsiyMal](tag, "SHAHSIY"){
//  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)
//  def name = column[String]("NAME", O.Default(""))
//  def surname = column[String]("SURNAME", O.Default(""))
//  def secondname = column[String]("SECONDNAME", O.Default(""))
//  def
//
//  def * = (id.?, name, surname, secondname) <> (oilaviyMal.tupled, oilaviyMal.unapply _)
//
//}
