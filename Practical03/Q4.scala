object SumOfEvenNumbers {

  def sumOfEvenNumbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sumEven = sumOfEvenNumbers(numbers)
    println(s"The sum of even numbers in the list $numbers is: $sumEven")
  }

}



