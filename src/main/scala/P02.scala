// Refer the LICENSE.md file in this repo for information regarding copyright.

// Find the last but one element of a list.
// Example:
// scala> penultimate(List(1, 1, 2, 3, 5, 8))
// res0: Int = 5

package src.main.scala

object P02 {
  def penultimate[T](l: List[T]): T = l match {
    case Nil => throw new NoSuchElementException
    case x::Nil => x
    case x::y::Nil => x
    case x::xs => penultimate(xs)
  }
}
