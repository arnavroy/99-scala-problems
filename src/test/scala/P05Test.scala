package src.test.scala

import org.scalatest._
import src.main.scala.P05

class P05Spec extends UnitSpec {
  "reverse function" should "return empty list for empty list" in {
    assert(P05.reverse(List()) == List()) 
  }

  it should "return Nil for Nil list" in {
    assert(P05.reverse(Nil) == Nil) 
  }

  it should "return 1 for List(1)"  in {
    assert(P05.reverse(List(1)) == List(1))
  }

  it should "return List(2, 1) for List(1, 2)" in {
    assert(P05.reverse(List(1, 2)) == List(2, 1))
  }

  it should "return List('c', 'b', 'a') for List('a', 'b', 'c')" in {
    assert(P05.reverse(List('a', 'b', 'c')) == List('c', 'b', 'a'))
  }
}
