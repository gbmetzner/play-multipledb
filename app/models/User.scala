package models

import scala.slick.driver.MySQLDriver.simple._
import scala.slick.lifted.ProvenShape

/**
 * Created by gbmetzner on 02/01/15.
 */
case class User(id: Option[Int], name: String)

class UserTable(tag: Tag) extends Table[User](tag, "user") {
  def id: Column[Option[Int]] = column[Option[Int]]("id", O.PrimaryKey, O.AutoInc)

  def name: Column[String] = column[String]("name", O.NotNull)

  override def * : ProvenShape[User] = (id, name) <>(User.tupled, User.unapply)
}
