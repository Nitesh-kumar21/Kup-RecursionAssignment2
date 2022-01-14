package Question1

import org.scalatest.flatspec.AnyFlatSpec

class FactorialTest extends AnyFlatSpec {
  val obj= new Factorial
  "Factorial " should "be Positive" in{
    val result: BigInt= obj.findFact(0)
    assert(result==1)
  }
  "Factorial" should "return 1 if user input 0" in{
    val result: BigInt= obj.findFact(0)
    assert(result==1)
  }
  "Factorial" should "return 1 if user input is 1" in{
    val result: BigInt=obj.findFact(1)
    assert(result==1)
  }
  "Factorial " should "return 0 if the user input is negative number" in{
    val result : BigInt= obj.findFact(-1)
    assert(result==1)
  }

}
