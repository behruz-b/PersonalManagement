package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))

  }

  def manzil = Action{
    Ok(views.html.manzil())
  }
  def homePage = Action{
    Ok(views.html.homePage())
  }
}