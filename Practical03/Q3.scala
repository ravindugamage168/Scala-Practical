import scala.io.StdIn
import scala.math.BigDecimal
object ArithmaticMean {

  def calculateAverage(num1: Int, num2: Int): Double = {
    val avg= (num1+num2)/2.0
    val roundedAvg = BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
     return roundedAvg
  }

  def main(args: Array[String]): Unit = {
    println("Enter the first number: ")
    val result1=StdIn.readLine().toInt

    println("Enter the Second number: ")
    val result2=StdIn.readLine().toInt

    val avg= calculateAverage(result1, result2)
    println("average of  given numbers is : " + avg)



  }

}

/*object ArithmeticMean {

  def calculateArithmeticMean(num1: Int, num2: Int): Double = {
    val mean = (num1 + num2) / 2.0
    mean.formatted("%.2f").toDouble
  }

  def main(args: Array[String]): Unit = {
    val num1 = 10
    val num2 = 15
    val average = calculateArithmeticMean(num1, num2)
    println(s"The arithmetic mean of $num1 and $num2 is: $average")
  }

}*/


