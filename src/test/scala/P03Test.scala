package src.test.scala

import org.scalatest._
import src.main.scala.P03

class P03Spec extends UnitSpec {
  "kth function" should "return NoSuchElementException for empty list" in {
    intercept[NoSuchElementException] {
      P03.kth(0, List())
    }
  }

  it should "return NoSuchElementException for Nil" in {
    intercept[NoSuchElementException] {
      P03.kth(0, Nil)
    }
  }

  it should "return NoSuchElementException for negative k" in {
    intercept[NoSuchElementException] {
      P03.kth(-1, List(1, 2))
    }
  }

  it should "return 1 as 0-th element of List(1)" in {
    assert(P03.kth(0, List(1)) == 1)
  }

  it should "return 2 as 1-th element of List(1, 2)" in {
    assert(P03.kth(1, List(1, 2)) == 2)
  }

  it should "return 'c' as 2-nd element of List('a', 'b', 'c')" in {
    assert(P03.kth(2, List('a', 'b', 'c')) == 'c')
  }
}
