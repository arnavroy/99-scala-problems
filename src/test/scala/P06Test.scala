package src.test.scala

import org.scalatest._
import src.main.scala.P06

class P06Spec extends UnitSpec {
  "isPalindrome function" should "return true for empty list" in {
    assert(P06.isPalindrome(List()) == true) 
  }

  it should "return true for Nil list" in {
    assert(P06.isPalindrome(Nil) == true) 
  }

  it should "return true for List(1)"  in {
    assert(P06.isPalindrome(List(1)) == true)
  }

  it should "return true for List(1, 2, 1)" in {
    assert(P06.isPalindrome(List(1, 2, 1)) == true)
  }

  it should "return false for List(1, 2)" in {
    assert(P06.isPalindrome(List(1, 2)) == false)
  }

  it should "return true for List(1, 2, 2, 1)" in {
    assert(P06.isPalindrome(List(1, 2, 2, 1)) == true)
  }

  it should "return true for List(1, 2, 3, 2, 1)" in {
    assert(P06.isPalindrome(List(1, 2, 3, 2, 1)) == true)
  }

  it should "return false for List(1, 2, 3)" in {
    assert(P06.isPalindrome(List(1, 2, 3)) == false)
  }
}
