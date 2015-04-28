package models

import sorm._

/**
 * Created by Bob on 2015-03-31.
 */
object DB extends Instance(
  entities = Seq(Entity[Person]()),
  url = "jdbc:hsqldb:file:test",
  user ="SA",
  password = ""
)
