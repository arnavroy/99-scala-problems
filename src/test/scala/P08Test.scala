package src.test.scala

import org.scalatest._
import src.main.scala.P08

class P08Spec extends UnitSpec {
  "compress function" should "return List(1, 2, 3, 2) for " +
    "List(1, 1, 2, 3, 3, 2, 2)" in {
    assert(P08.compress(List(1, 1, 2, 3, 3, 2, 2)) ==
      List(1,2,3,2)) 
  }
}
