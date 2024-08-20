import scala.io.StdIn
object PatternMatching {
  def main(args: Array[String]): Unit = {

    println("Enter an integer value:")
    val input = StdIn.readLine()

    val number = input.toInt

    // lambda function
    val checkNumber: Int => String = number => {
      if (number == 0) 
        "Your input is : Zero"
      else if (number < 0) 
        "Negative number is given"
      else if (number % 2 == 0) 
        "Even number is given"
      else 
        "Odd number is given"
    }

    println(checkNumber(number))
  }
}
