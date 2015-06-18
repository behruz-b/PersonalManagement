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

