package src.test.scala

import org.scalatest._
import src.main.scala.P01

class P01Spec extends UnitSpec {
  "last function" should "return NoSuchElementException for empty list" in {
    intercept[NoSuchElementException] {
      P01.last(List())
    }
  }

  it should "return 1 for List(1)" in {
    assert(P01.last(List(1)) == 1)
  }

  it should "return 2 for List(1, 2)" in {
    assert(P01.last(List(1, 2)) == 2)
  }

  it should "return b for List('a', 'b')" in {
    assert(P01.last(List('a', 'b')) == 'b')
  }
}
