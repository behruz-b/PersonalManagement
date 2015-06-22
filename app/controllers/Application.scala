package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
//    hghghgh ghghgkjbxkcbxkcxbckxhbxhcbxhc
  }
  def OqituvchilarAnketasi = Action{
    Ok(views.html.OqituvchiAnketasi())
  }
  def talabalar = Action{
    Ok(views.html.talabalar())
  }
  def OqituvchilarRoyhati = Action{
    Ok(views.html.OqituvchilarRoyhati())
  }
  def manzil = Action{
    Ok(views.html.manzil())
  }
}