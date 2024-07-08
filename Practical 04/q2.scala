object PatternMatching {
  def main(args: Array[String]): Unit = {
    
    println("Enter an integer value:")
    val input = scala.io.StdIn.readLine()

    
    val number = input.toInt

    if (number == 0) 
    {
      println("Your input is : Zero")
    } 
    else if (number < 0) 
    {
      println("Negative number is given")
    } 
    else if (number % 2 == 0) 
    {
      println("Even number is given")
    } 
    else 
    {
      println("Odd number is given")
    }

  }
}

