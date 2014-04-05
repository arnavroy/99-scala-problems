// Refer the LICENSE.md file in this repo for information regarding copyright.

// Find out whether a list is a palindrome.
// Example:
// scala> isPalindrome(List(1, 2, 3, 2, 1))
// res0: Boolean = true

package src.main.scala

object P06 {
  def isPalindrome[T](l: List[T]): Boolean = l match {
    case Nil => true
    case x::Nil => true
    case x::xs => (x == xs.last) && isPalindrome(xs.init)
  }
}
