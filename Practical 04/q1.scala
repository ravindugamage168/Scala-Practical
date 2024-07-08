object InventoryManagementSystem {
  var itemNames: Array[String] = Array("Apple", "Banana", "Orange" , "Pineapple")
  var itemQuantities: Array[Int] = Array(10, 5, 7 , 8)

  def displayInventory(): Unit = {
    println("Current Inventory:")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemQuantities(i)}")
    }
  }

  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
      itemQuantities(index) += quantity
      println(s"$quantity $itemName added. New $itemName quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item $itemName does not exist in the store.")
    }
  }

  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) 
    {
      if (itemQuantities(index) >= quantity) 
      {
        itemQuantities(index) -= quantity
        println(s"$quantity $itemName sold. New $itemName quantity: ${itemQuantities(index)}")
      } 
      
      else
      {
        println(s"Not enough $itemName in stock to sell $quantity. Current $itemName quantity: ${itemQuantities(index)}")
      }
    } 
    
    else 
    {
      println(s"Item $itemName does not exist in the store.")
    }
  }

  
  def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("Apple", 5)
    sellItem("Banana", 2)
    sellItem("Orange", 10)
    restockItem("Grape", 10)
    sellItem("Pineapple" , 4)
    displayInventory()
  }
}
