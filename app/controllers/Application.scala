package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))

  }
  def OqituvchilarAnketasi = Action{
    Ok(views.html.OqituvchiAnketasi())
  }
  def OqituvchilarRoyhati = Action{
    Ok(views.html.OqituvchilarRoyhati())
  }
  def manzil = Action{
    Ok(views.html.manzil())
  }
  def boshSahifa = Action{
    Ok(views.html.boshSahifa())
  }
}