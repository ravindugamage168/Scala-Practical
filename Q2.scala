object tempConvertor{

    def celsiousToFahranheit(celsious: Double): Double={
        celsious * 1.8+32
    }

    def main(args:Array[String]): Unit={
        println(s"35°C is equal to ${celsiousToFahranheit(35)}°F")
    }
}