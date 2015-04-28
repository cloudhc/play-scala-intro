package models

import play.api.libs.json.Json

/**
 * Created by Bob on 2015-03-31.
 */
case class Person(name: String)

object Person {

  implicit val personFormat = Json.format[Person]
}
