import scala.io.StdIn

object ReversedString {

  def reversedString(str: String) : Unit = {
    val reversed=str.reverse
    println(s"Original: $input_str")
    println(s"Reversed: $reversed")

  }

  def main(args: Array[String]): Unit = {

    println("Enter a string to reverse : ")
    val input_str=StdIn.readLine()
    reversedString(input_str)
  }

}
