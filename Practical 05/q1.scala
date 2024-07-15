import scala.io.StdIn.readLine

object InventoryManagementSystem {

  def getProductList(): List[String] = {
    var products = List[String]()
    var input = ""

    while (input != "enough") {
      input = readLine("Enter product name (type 'enough' to finish): ")
      if (input != "enough") {
        products = products :+ input
      }
    }

    products
  }

  def printProductList(products: List[String]): Unit = {
    products.zipWithIndex.foreach { case (product, index) =>
      println(s"${index + 1}. $product")
    }
  }

  def getTotalProducts(products: List[String]): Int = {
    products.length
  }

  def main(args: Array[String]): Unit = {
    val products = getProductList()
    if (products.isEmpty) {
      println("Products List Empty!")
    } 
    
    else 
    {
      println("\nProduct List:")
      printProductList(products)
    }

    println(s"\nTotal number of products: ${getTotalProducts(products)}")
}


    
}