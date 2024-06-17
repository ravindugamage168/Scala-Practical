object sphereVolume{
    def calculateVolume(radius: Double): Double={
        val pi=math.Pi
        (4.0/3.0)* pi* radius* radius* radius
    }

    def main(args: Array[String]): Unit={
        println(s"Volume of the sphere with radius 5: ${calculateVolume(5)}")
    }
}