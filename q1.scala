import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object inventory_Management {
    def main(args: Array[String]): Unit={
        
        def getProductList(list: List[String]): List[String] ={
            val word = readLine("Enter the Product or Enter 'done' to stop adding list: ")
            word match {
                case "done" => list
                case _ => getProductList(list :+ word)
            }
        }

        def printProductList(list:List[String],index: Int = 1): Any = if(!list.isEmpty){
                println(s"$index => ${list.head}")
                printProductList(list.tail,index + 1)
            }

        def getTotalProducts(list:List[String]): Unit = {
            println(s"The total number of Products is: ${list.length}")

        }

        val initialList = List[String]()
        val productList = getProductList(initialList)
        printProductList(productList)
        getTotalProducts(productList)

    }
}