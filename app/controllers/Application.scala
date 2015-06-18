package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
//    hghghgh ghghgkjbxkcbxkcxbckxhbxhcbxhc
  }
  def OqituvchiAnketasi = Action{
    Ok(views.html.OqituvchiAnketasi())
  }
  def hodimlar = Action{
    Ok(views.html.hodimlar())
  }
  def talabalar = Action{
    Ok(views.html.talabalar())
  }
}