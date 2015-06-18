package models

/**
 * Created by Sawyer on 17.06.2015.
 */


case class Teacher(id: Option[Int],
                        name:String,
                        surname:String,

                        day:String,
                        month:String,
                        year:String,

                        passportSeries:String,
                        role:String,
                        department:String,
                         livingPlace:String)

class TeacherTable(tag:Tag) extends Table[Teacher](tag,"TEACHERS"){
    def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)
    def name = column[String]("NAME",O.Default(""))
    def surname = column[String]("NAME",O.Default(""))
    def day = column[String]("NAME",O.Default(""))
    def month = column[String]("NAME",O.Default(""))
    def year = column[String]("NAME",O.Default(""))
    def passportSeries = column[String]("NAME",O.Default(""))
    def role = column[String]("NAME",O.Default(""))
    def department = column[String]("NAME",O.Default(""))
    def livingPlace = column[String]("NAME",O.Default(""))
}