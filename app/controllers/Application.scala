package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))

  }

  def manzil = Action{
    Ok(views.html.manzil())
  }
  def boshSahifa = Action{
    Ok(views.html.boshSahifa())
  }
}