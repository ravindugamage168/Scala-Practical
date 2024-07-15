import scala.io.StdIn.readLine

case class Book(title: String, author: String, isbn: String)

object LibraryManagement {

  var library: Set[Book] = Set(
    Book("1984", "George Orwell", "9780451524935"),
    Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"),
    Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565")
  )

  def addBook(book: Book): Unit = {
    library += book
    println(s"New Book added: ${book.title} by ${book.author} (ISBN: ${book.isbn})")
  }

  def removeBookByIsbn(isbn: String): Unit = {
    library.find(_.isbn == isbn) match {
      case Some(book) =>
        library -= book
        println(s"Book with ISBN $isbn removed: ${book.title} by ${book.author}")
      case None =>
        println(s"No book found with ISBN $isbn")
    }
  }

  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  def displayBookCollection(): Unit = {
    if (library.isEmpty) {
      println("The library is empty.")
    } else {
      println("Current Book Collection:")
      library.foreach { book =>
        println(s"Title: ${book.title}\tAuthor: ${book.author}\t ISBN: ${book.isbn}")
        }
    }
  }

  def searchBookByTitle(title: String): Option[Book] = {
    library.find(_.title.equalsIgnoreCase(title))
  }

  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.isEmpty) 
    {
      println(s"No books found by author $author")
    } 
    else 
    {
      println(s"Books by $author:")
      booksByAuthor.foreach { book =>
        println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    }
  }
}

object LibraryApp extends App 
{
  import LibraryManagement._

  def showMenu(): Unit = 
    {
    println(
      """
        ****Library Management System****
        |1. Add a new book
        |2. Remove a book by ISBN
        |3. Check if a book is in the library by ISBN
        |4. Display the current library collection
        |5. Search for a book by title
        |6. Display all books by a specific author
        |7. Exit
      """.stripMargin)
  }

  def addNewBook(): Unit = {
    val title = readLine("Enter book title: ")
    val author = readLine("Enter book author: ")
    val isbn = readLine("Enter book ISBN: ")
    addBook(Book(title, author, isbn))
  }

  def removeBook(): Unit = {
    val isbn = readLine("Enter book ISBN to remove from collection: ")
    removeBookByIsbn(isbn)
  }

  def checkBook(): Unit = {
    val isbn = readLine("Enter book ISBN to check: ")
    if (isBookInLibrary(isbn)) {
      println(s"Book with ISBN $isbn is available in the library")
    } else {
      println(s"Book with ISBN $isbn is not available in the library")
    }
  }

  def searchBook(): Unit = {
    val title = readLine("Enter book title to search: ")
    searchBookByTitle(title) match {
      case Some(book) => println(s"Found book: ${book.title} by ${book.author} (ISBN: ${book.isbn})")
      case None => println(s"No book found with title $title")
    }
  }

  def displayAllBooksByAuthor(): Unit = {
    val author = readLine("Enter author name: ")
    displayBooksByAuthor(author)
  }

  var running = true
  while (running) {
    showMenu()
    val choice = readLine("Choose an option: ").toInt

    choice match {
      case 1 => addNewBook()
      case 2 => removeBook()
      case 3 => checkBook()
      case 4 => displayBookCollection()
      case 5 => searchBook()
      case 6 => displayAllBooksByAuthor()
      case 7 => running = false
                println("Thank You!!!!")
      case _ => println("Invalid option. Please try again.")
    }
    
  }
}

