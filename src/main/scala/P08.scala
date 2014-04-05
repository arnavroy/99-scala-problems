// Refer the LICENSE.md file in this repo for information regarding copyright.

// Eliminate consecutive duplicates of list elements.
// If a list contains repeated elements they should be replaced with a
// single copy of the element. The order of the elements should not be changed.
// scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e))
// res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

package src.main.scala

object P08 {
  def compress[T](l: List[T]): List[T] = {
    l.foldLeft(List[T]()) {(acc: List[T], listItem: T) =>
      if (acc.isEmpty || (acc.last != listItem)) {
        acc ++ List(listItem)
      } else {
        acc
      }
    }
  }
}
