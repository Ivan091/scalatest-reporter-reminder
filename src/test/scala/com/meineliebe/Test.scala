package com.meineliebe

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

final class Test extends AnyWordSpec with Matchers {

  "successful test 1" in {
    1 shouldBe 1
  }

  "successful test 2" in {
    1 shouldBe 1
  }

  "failing test 1" in {
    throw new RuntimeException("Failing test 1 is failing")
  }

  "failing test 2" in {
    throw new RuntimeException("Failing test 2 is failing ")
  }

  "successful test 3" in {
    1 shouldBe 1
  }
}
