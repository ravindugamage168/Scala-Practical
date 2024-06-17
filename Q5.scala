object runningTime{
    def easyPase(distance:Int): Double={
        distance/8.0
    }

    def tempo(distance:Int): Double={
        distance/7.0
    }
    def calculateTotalTime(): Double={
        easyPase(2)+tempo(3)+easyPase(2)
    }

    def main(args: Array[String]):Unit={
        println(s"Total running time: ${calculateTotalTime()} minutes")
    }
}