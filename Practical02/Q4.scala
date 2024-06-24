object TicketCounter{
    def calcullateAttendence(price: Int):Int={
        120 + (15-price)/5*20
    }

    def calculateRevenue(price: Int):Int ={
        calcullateAttendence(price) * price
    }

    def calculateCost(price: Int):Int={
        500+calcullateAttendence(price)*3
    }

    def totalProfit(price: Int)={
        calculateRevenue(price)-calculateCost(price)
    }

    /*def main(args: Array[String]):Unit={
        println(s"Total profit when ticket price is Rs.15 : ${totalProfit(15)}")   
        println(s"Total profit when ticket price is Rs.20 : ${totalProfit(20)}")   
        println(s"Total profit when ticket price is Rs.25 : ${totalProfit(25)}")   
        println(s"Total profit when ticket price is Rs.30 : ${totalProfit(30)}")   
        println(s"Total profit when ticket price is Rs.35 : ${totalProfit(35)}")   
    }*/

       def main(args: Array[String]): Unit = {
       // List of ticket prices to evaluate
       val prices = List(15, 20, 25, 30, 35)

      // Calculate profits for each ticket price
      val profits = prices.map(price => (price, totalProfit(price)))

      // Find the price with the maximum profit
      val (bestPrice, bestProfit) = profits.maxBy(_._2)

      // Print the total profits for given ticket prices
      prices.foreach(price => println(s"Total profit when ticket price is Rs.$price : ${totalProfit(price)}"))

      // Print the best ticket price and the corresponding profit
      println(s"\nBest ticket price for maximum profit is Rs.$bestPrice with a profit of Rs.$bestProfit")
    }

}