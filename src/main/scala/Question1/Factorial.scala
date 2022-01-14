package Question1



class Factorial extends App {

  def findFact(input: BigInt): BigInt =

    if (input <= 1) 1
    else {

      val result = input * findFact(input - 1)

      result
    }


}

