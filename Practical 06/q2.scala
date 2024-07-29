import scala.io.StdIn

object StudentRecords extends App {
  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = 
  {
    if (name.isEmpty) 
    {
      (false, Some("Name cannot be empty"))
    } 
    else if (marks < 0 || marks > totalMarks) 
    {
      (false, Some("Marks must be positive and not exceed the total possible marks"))
    } 
    else 
    {
      (true, None)
    }
  }

  def getStudentInfo(): (String, Int, Int, Double, Char) = 
  {
    println("Enter student's name:")
    val name = StdIn.readLine()
    
    println("Enter student's marks:")
    val marks = StdIn.readInt()
    
    println("Enter total possible marks:")
    val totalMarks = StdIn.readInt()
    
    val (isValid, errorMessage) = validateInput(name, marks, totalMarks)
    if (!isValid) 
    {
      println(s"Error: ${errorMessage.getOrElse("Invalid input")}")
      getStudentInfo()
    } 
    else 
    {
      val percentage = marks.toDouble / totalMarks * 100
      val grade = percentage match {
        case p if p >= 90 => 'A'
        case p if p >= 75 => 'B'
        case p if p >= 50 => 'C'
        case _ => 'D'
      }
      (name, marks, totalMarks, percentage, grade)
    }
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = 
  {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks: $marks / $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = 
  {
    var validInput = false
    var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'F')
    while (!validInput) {
      println("Enter student's name:")
      val name = StdIn.readLine()
      
      println("Enter student's marks:")
      val marks = StdIn.readInt()
      
      println("Enter total possible marks:")
      val totalMarks = StdIn.readInt()
      
      val (isValid, errorMessage) = validateInput(name, marks, totalMarks)
      if (!isValid) 
      {
        println(s"Error: ${errorMessage.getOrElse("Invalid input")}")
      } 
      else 
      {
        val percentage = marks.toDouble / totalMarks * 100
        val grade = percentage match {
          case p if p >= 90 => 'A'
          case p if p >= 75 => 'B'
          case p if p >= 50 => 'C'
          case _ => 'D'
        }
        studentInfo = (name, marks, totalMarks, percentage, grade)
        validInput = true
      }
    }
    studentInfo
  }

  val studentInfo = getStudentInfoWithRetry()
  printStudentRecord(studentInfo)
}
