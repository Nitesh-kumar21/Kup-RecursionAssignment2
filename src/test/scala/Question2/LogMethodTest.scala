package Question2

import org.scalatest.flatspec.AnyFlatSpec

class LogMethodTest extends AnyFlatSpec {

  "Log" should "be valid" in{
    val result =new LogMethod()
    assert("This is my first LOG INFO" == result.log("This is my first LOG"))

  }
  "Log" should "be invalid" in {
    val result = new LogMethod()
    assert(!("This is my first LOG " == result.log("This is my first LOG")))
  }

  }
