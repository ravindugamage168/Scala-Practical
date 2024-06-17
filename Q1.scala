object DiskArea{

  def calculateArea(radius: Double): Double={
    val pi= math.Pi
    pi*radius*radius
  }

  def main(args: Array[String]): Unit={
    println(s"Area of the disk with radius 5: ${calculateArea(5)}")
  }
}