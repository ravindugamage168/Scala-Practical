object FilterStrings {

  def filterStringsByLength(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List("Dog", "Elephant", "Lion", "Tiger", "Dear", "Rabbit")
    val filteredList = filterStringsByLength(inputList)
    
    println("Original List of Strings : ")
    inputList.foreach(println)
    
    println("\nFiltered List  by length(length > 5) : ")
    filteredList.foreach(println)
  }

}

