// Refer the LICENSE.md file in this repo for information regarding copyright.

// Reverse a list.
// Example:
// scala> reverse(List(1, 1, 2, 3, 5, 8))
// res0: List[Int] = List(8, 5, 3, 2, 1, 1)

package src.main.scala

object P05 {
  def reverse[T](l: List[T]): List[T] = l match {
    case List() => l
    case Nil => Nil
    case x::xs => xs match {
      case Nil => List(x)
      case _ => reverse(xs) ++ List(x)
    }
  }
}
