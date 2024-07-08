object NameFormatter {
  def toUpper(str: String): String = str.toUpperCase

  def toLower(str: String): String = str.toLowerCase

  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {
    //Inputs for testting
    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    
    println(formatNames(name1)(toUpper))       
    println(formatNames(name2)(name => name.take(2).toUpperCase + name.drop(2))) 
    println(formatNames(name3)(toLower))       
    println(formatNames(name4)(name => name.take(1).toUpperCase + name.drop(1).dropRight(1) + name.takeRight(1).toUpperCase)) 
  }
}
