package src.test.scala

import org.scalatest._
import src.main.scala.P02

class P02Spec extends UnitSpec {
  "penultimate function" should "return NoSuchElementException for empty list" in {
    intercept[NoSuchElementException] {
      P02.penultimate(List())
    }
  }

  it should "return 1 for List(1)" in {
    assert(P02.penultimate(List(1)) == 1)
  }

  it should "return 1 for List(1, 2)" in {
    assert(P02.penultimate(List(1, 2)) == 1)
  }

  it should "return 2 for List(1, 2, 3)" in {
    assert(P02.penultimate(List(1, 2, 3)) == 2)
  }

  it should "return 'b' for List('a', 'b', 'c')" in {
    assert(P02.penultimate( List('a', 'b', 'c')) == 'b')
  }
}
