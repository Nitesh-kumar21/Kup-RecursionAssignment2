package Question1

import org.scalatest.flatspec.AnyFlatSpec

class TailFactorialTest extends AnyFlatSpec {
  val obj= new TailFactorial
  "Factorial " should "be Positive" in{
    val result: BigInt= obj.anotherFactorial(0)
    assert(result==1)
  }
  "Factorial" should "return 1 if user input 0" in{
    val result: BigInt= obj.anotherFactorial(0)
    assert(result==1)
  }

  "Factorial" should "return 0 if the user input is negative" in{
    val result: BigInt=obj.anotherFactorial(-1)
    assert(result==1)
  }

}
