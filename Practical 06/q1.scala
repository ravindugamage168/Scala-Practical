object InventorySystem extends App {
  // Define a case class for Product
  case class Product(name: String, quantity: Int, price: Double)

  var inventory1: Map[Int, Product] = Map(
    101 -> Product("Book", 20, 200),
    102 -> Product("Pencil", 10, 40),
    103 -> Product("Pen", 15, 30),
    104 -> Product("Water Bottle", 5, 500)
  )

  var inventory2: Map[Int, Product] = Map(
    102 -> Product("Pen", 5, 40),
    105 -> Product("Eraser", 10, 25),
    106 -> Product("Lunch Box", 10, 400)
  )

  def getProductNames(inventory: Map[Int, Product]): Seq[String] = 
  {
    inventory.values.map(_.name).toSeq
  }

  def getTotalValue(inventory: Map[Int, Product]): Double =   
  {
    inventory.values.map(product => product.quantity * product.price).sum
  }

  def isInventoryEmpty(inventory: Map[Int, Product]): Boolean = 
  {
    inventory.isEmpty
  }

  def mergeInventories(inventory1: Map[Int, Product], inventory2: Map[Int, Product]): Map[Int, Product] = 
  {
    inventory2.foldLeft(inventory1) {
      case (acc, (id, product)) =>
        acc.get(id) match {
          case Some(existingProduct) =>
            acc.updated(id, Product(
              existingProduct.name,
              existingProduct.quantity + product.quantity,
              math.max(existingProduct.price, product.price)
            ))
          case None => acc + (id -> product)
        }
    }
  }

  def printProductDetails(inventory: Map[Int, Product], productId: Int): Unit = 
  {
    inventory.get(productId) match {
      case Some(product) => println(s"Product details with ID $productId")
      println(f"Product ID: $productId, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}%.2f")
      case None => println(s"Product with ID $productId does not exist in Inventory1.")
    }
  }

  def printInventory(inventory: Map[Int, Product]): Unit = 
  {
    inventory.foreach { case (id, product) =>
      println(f"Product ID: $id, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}%.2f")
    }
  }

  println("****Inventory System for School Items Shop****")
  
  println("Product Names in Inventory1:")
  getProductNames(inventory1).foreach(name => println(s"- $name"))

  println(" ")
  println(f"Total Value of Inventory1: ${getTotalValue(inventory1)}%.2f")

  println(" ")
  println(s"Is Inventory1 Empty? ${if (isInventoryEmpty(inventory1)) "Inventory1 is Empty!" else "No"}")

  println(" ")
  println("Product Names in Inventory2:")
  getProductNames(inventory2).foreach(name => println(s"- $name"))

  println(" ")
  val mergedInventory = mergeInventories(inventory1, inventory2)
  println("Merged Inventory:-")
  printInventory(mergedInventory)

  println(" ")
  printProductDetails(inventory1, 102)
}

