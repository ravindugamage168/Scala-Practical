object bookCost{
    def calculateDiscount(coverprice: Double, discount:Double):Double={
        coverprice *(1-discount);
    }

    def calculateShippingCost(numCopies: Int):Double={
        if (numCopies<=50){
            3.0
        }
        else{
            0.75 * (numCopies-50)
        }
    }

    def calculateWholesalePrice(coverprice: Double,numCopies: Int, discount: Double):Double={
        (calculateDiscount(coverprice,discount) * numCopies) + calculateShippingCost(numCopies)
    }

    def main(args:Array[String]):Unit={
        println(s"Wholesale cost for 60 books: Rs. ${calculateWholesalePrice(24.95,60,0.4)}")
    }
}