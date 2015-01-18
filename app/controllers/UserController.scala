package controllers

import models.User
import play.api.mvc.{Action, Controller}
import services.UserService

/**
 * Created by gbmetzner on 15/01/15.
 */
object UserController extends Controller {

  def save(name: String) = Action {

      UserService.insert(User(None, name))(name)

      Ok("saved")
  }

}
