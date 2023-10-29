package uk.fergcb.maxsum

import Main.{Node, maxSubList}

import org.scalatest._
import org.scalatest.flatspec._
import org.scalatest.matchers._

class MaxSubListSpec extends AnyFlatSpec with should.Matchers {
  "maxSubList" should "work" in {
    maxSubList(None) should be (0)
    maxSubList(
      Some(Node(-2,
        Some(Node(1,
          Some(Node(-3,
            Some(Node(4,
              Some(Node(-1,
                Some(Node(2,
                  Some(Node(1,
                    Some(Node(-5,
                      Some(Node(4, None))))))))))))))))))) should be (6)
  }
}
