package repositories

import models.{User, UserTable}

import scala.slick.driver.MySQLDriver.simple._
import scala.slick.lifted.TableQuery

/**
 * Created by gbmetzner on 12/01/15.
 */
object UserRepository {

  private val userTable = TableQuery[UserTable]

  def insert(user: User)(implicit s: Session): Unit = userTable += user

}
