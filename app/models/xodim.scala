package models



case class xodim(id: Option[Int],
                First_name: String,
                Last_name: String,
                Second_name: String,
                Department: String,
                Boss: String)

//class HodimTable(tag: Tag) extends  Table[Hodim](tag, "Hodimlar"){
//
//  def id = column[Int]("ID", O.PrimaryKey, O.AutoInc)
//
//  def First_name = column[String]("FIRST_NAME", O.Default(""))
//
//  def Last_name = column[String]("LAST_NAME", O.Default(""))
//
//  def Second_name = column[String]("SECOND_NAME", O.Default(""))
//
//  def Department = column[String]("DEPARTMENT", O.Default(""))
//
//  def Boss = column[String]("BOSS", O.Default(""))
//
//  def * = (id.?, First_name, Last_name, Second_name, Department, Boss) <> (Hodim.tupled, Hodim.unapply _)
//
//}
