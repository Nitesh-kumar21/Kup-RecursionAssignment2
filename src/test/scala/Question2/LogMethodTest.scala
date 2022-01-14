package Question2

import org.scalatest.flatspec.AnyFlatSpec

class LogMethodTest extends AnyFlatSpec {

  "Log" should "be valid" in{
    val result =new LogMethod()

    assert("[INFO]:This is my first LOG" == result.log(message="This is my first LOG"))

  }

  "Log" should "be invalid" in {
    val result = new LogMethod()
    assert(!("[This is my second LOG]:INFO" == result.log(message="This is my first LOG")))
  }

  }
