// Refer the LICENSE.md file in this repo for information regarding copyright.

// P01: Find the last element of a list.
// Example:
// scala> last(List(1, 1, 2, 3, 5, 8))
// res0: Int = 8

package src.main.scala

object P01 {
  def last[T](l: List[T]): T = l match {
      case Nil => throw new NoSuchElementException
      case x::Nil => x
      case x::xs => last(xs)
  } 
}
