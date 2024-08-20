import scala.io.StdIn
object Interest {

  val calculateInterest: Double => Double = depositAmount => {
    depositAmount match {
      case amount if amount <= 20000    => amount * 0.02
      case amount if amount <= 200000   => amount * 0.04
      case amount if amount <= 2000000  => amount * 0.035
      case amount if amount > 2000000   => amount * 0.065
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter deposit ammount: ")
    val depositAmount = StdIn.readDouble()
    val interestEarned = calculateInterest(depositAmount)
    println(f"Interest earned on Rs. $depositAmount%.2f is Rs. $interestEarned%.2f")
  }
}
