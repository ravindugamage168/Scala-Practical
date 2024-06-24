object EvaluateExpressions {
  
  var a: Int = 2
  var b: Int = 3
  var c: Int = 4
  var d: Int = 5
  var k: Float = 4.3f

  def evaluateExpressions(): Unit = {
    // a)
    println( (-(-b) * a + c * d) )

    // b) 
    println(a)
    a += 1 // Equivalent to a++ in scala

    // c)
    val g = 1.0 
    println( -2 * (g - k) + c )

    // d)
    println(c)
    c += 1 // Equivalent to c++ in scala

    // e)
    c = c + 1 // Equivalent to ++c in Scala
    val result = c * a
    a += 1 // Equivalent to a++ in scala
    println(result)
  }

  def main(args: Array[String]): Unit = {
    evaluateExpressions()
  }
}