package services

import models.User
import play.api.Play.current
import play.api.db._
import repositories.UserRepository

import scala.slick.driver.MySQLDriver.simple._

/**
 * Created by gbmetzner on 12/01/15.
 */
object UserService {

  private case class DSLocator(dsName: String) {
    val db = Database.forDataSource(DB getDataSource dsName)
  }

  def insert(user: User)(dsName: String): Unit = DSLocator(dsName).db.withTransaction {
    implicit session =>
      UserRepository insert user
  }
}

