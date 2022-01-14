package Question1

import scala.annotation.tailrec


class TailFactorial {


  def anotherFactorial(n:Int):BigInt ={

@tailrec
    def factHelper (input: Int, accumulator: BigInt): BigInt= {

      if(input<=1) accumulator
      else factHelper(input-1, input*accumulator)
    }

    factHelper(n, 1)
  }



}
