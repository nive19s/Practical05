import scala.collection.mutable.Set

object Q2 {

  case class Book(title: String, author: String, isbn: String)

  var library: Set[Book] = Set(
    Book("The Dark Room", "Narayan", "12415124"),
    Book("Ignited Minds", "APJ Abdul Kalam", "3421351"),
    Book("The Golden Gate", "Vikram Seth", "77771111")
  )

  def addBook(book: Book): Unit = {
    library += book
    println("Book successfully added")
  }

  def removeBook(isbn: String): Unit = {
    library = library.filterNot(_.isbn == isbn)
    println("Book successfully removed")
  }

  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    library.foreach { book =>
      println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
    }
  }

  def searchBookByTitle(title: String): Option[Book] = {
    library.find(_.title.equalsIgnoreCase(title))
  }

  def displayBooksByAuthor(author: String): Unit = {
    library.filter(_.author.equalsIgnoreCase(author)).foreach { book =>
      println(s"Title: ${book.title}, ISBN: ${book.isbn}")
    }
  }

  def main(args: Array[String]): Unit = {
   
    println(isBookInLibrary("3421351"))
    addBook(Book("Brave New World", "Aldous Huxley", "6677889900"))
    removeBook("12415124") // Remove"The Dark Room"
    displayLibrary()

    val searchResult = searchBookByTitle("Ignited Minds")
    searchResult match {
      case Some(book) => println(s"Book is found: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None => println("Book not found")
    }
    displayBooksByAuthor("Vikram Seth")//display books of Vikram Seth
  }
}