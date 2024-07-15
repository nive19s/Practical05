import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object fibonacci {
    def main(args: Array[String]): Unit = {
        
        def fibonacci_series(n:Int): Int = n match {
            case x if (x==0)=> 0
            case x if(x ==1) => 1
            case _ => fibonacci_series(n-1)+ fibonacci_series(n-2)
            
        }

        def print_fibonacci(x:Int): Unit ={
            if (x>0) print_fibonacci(x-1)
            print(s"${fibonacci_series(x)} ,")
        }
        print("Enter the number: ")
        var a = readInt()
        println(s"First ${a} fibonacci numbers  : ")
        print_fibonacci(a)
    }
}
