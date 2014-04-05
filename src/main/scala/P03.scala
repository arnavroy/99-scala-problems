// Refer the LICENSE.md file in this repo for information regarding copyright.

// Find the Kth element of a list.
// By convention, the first element in the list is element 0.
// Example:
// scala> nth(2, List(1, 1, 2, 3, 5, 8))
// res0: Int = 2

package src.main.scala

object P03 {
  def kth[T](k: Int, l: List[T]): T = {
    if (k < 0 || l.length <= k) 
      throw new NoSuchElementException
    else
      l match {
        case x::xs => {
          if (k == 0) return x
          else return kth(k - 1, xs)
        }
        case Nil => throw new NoSuchElementException
      } 
  }
}
