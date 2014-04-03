package src.test.scala

import org.scalatest._
import src.main.scala.P01

class StackSpec extends UnitSpec {
  "The getOne function" should "always return 1" in {
    assert(P01.getOne() == 1)
  }
}
