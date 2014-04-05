package src.test.scala

import org.scalatest._
import src.main.scala.P04

class P04Spec extends UnitSpec {
  "length function" should "return 0 for empty list" in {
    assert(P04.length(List()) == 0) 
  }

  it should "return 0 for Nil list" in {
    assert(P04.length(Nil) == 0) 
  }

  it should "return 1 for List(1)"  in {
    assert(P04.length(List(1)) == 1)
  }

  it should "return 2 for List(1, 2)" in {
    assert(P04.length(List(1, 2)) == 2)
  }

  it should "return 3 for List('a', 'b', 'c')" in {
    assert(P04.length(List('a', 'b', 'c')) == 3)
  }
}
