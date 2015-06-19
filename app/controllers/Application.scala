package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
//    hghghgh ghghgkjbxkcbxkcxbckxhbxhcbxhc
  }
  def OqituvchilarAnketasi = Action{
    Ok(views.html.OqituvchiAnketasi())
  }
  def OqituvchilarRoyhati = Action{
    Ok(views.html.OqituvchilarRoyhati())
  }
  def Xodimlar = Action{
    Ok(views.html.Xodimlar())
  }
  def manzil = Action{
    Ok(views.html.manzil())
  }
  def XodimlarRoyhati = Action{
    Ok(views.html.XodimlarRoyhati())
  }
}