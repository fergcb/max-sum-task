package uk.fergcb.maxsum

object Main {

  /*
   * The maxSubList function computes the maximum sum of
   * a contiguous subsequence in a linked list of integers.
   *
   * Consider the following sequence:
   *   5, 7, 1, 0, 4, 2
   *
   * Seeing as this sequence consists only of non-negative numbers,
   * the largest possible sum of a sequence of these numbers is
   * the sum of the whole sequence, 19.
   *
   * Now consider an empty sequence. The largest sum you can
   * get from an empty sequence is 0. Your function should
   * return zero when given an empty list.
   *
   * The task is more challenging when negative numbers are included
   * in the sequence. Consider the following:
   *   -2, 1, -3, 4, -1, 2, 1, -5, 4
   *
   * The subsequence with the greatest sum here is (4, -1, 2, 1),
   * for a total of 6. We could expand the subsequence to the right,
   * in order to include the 4 at the end of the list, but to do so
   * we would have to also take -5, which would nullify the effort.
   *
   *
   * The task:
   *  - Implement the maxSubList function as described above,
   *    building on the function signature given below.
   *  - The function should take a linked list as input,
   *    using the linked list implementation given below.
   *  - You should use a test driven approach (TDD). A basic
   *    ScalaTest file is provided, but you may use any
   *    suitable method/framework.
   *  - Your solution should be optimised for time and
   *    memory usage, where possible.
   *
   *
   * Assumptions:
   *  - The empty list is represented by `None`
   *  - The empty list is a valid sublist, with a sum of 0.
   *  - The input list may contain numbers between -500 and 500 (inclusive)
   */

  // Linked List definition
  sealed trait LinkedListNode[+A]
  case class Node[A](value: A, next: Option[Node[A]]) extends LinkedListNode[A]

  def maxSubList(head: Option[Node[Int]]): Int = {
    0 // Your solution here
  }

  def main(args: Array[String]): Unit = {}
}