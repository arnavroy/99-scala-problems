// Refer the LICENSE.md file in this repo for information regarding copyright.

// Find the number of elements of a list.
// Example:
// scala> length(List(1, 1, 2, 3, 5, 8))
// res0: Int = 6

package src.main.scala

object P04 {
  def length[T](l: List[T]): Int = l match {
    case Nil => 0
    case x::xs => 1 + length(xs)
  }
}
