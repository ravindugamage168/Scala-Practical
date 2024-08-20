object NameFormatter {

  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {
    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    //lambda functions
    println(formatNames(name1)(name => name.toUpperCase)) 
    println(formatNames(name2)(name => name.take(2).toUpperCase + name.drop(2))) 
    println(formatNames(name3)(name => name.toLowerCase)) 
    println(formatNames(name4)(name => name.take(1).toUpperCase + name.drop(1).dropRight(1) + name.takeRight(1).toUpperCase))
  }
}
