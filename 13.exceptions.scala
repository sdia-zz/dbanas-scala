import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object ScalaTutorial {

    def main(args: Array[String]){

        def divideNums(num1: Int, num2: Int) = try
        {
            (num1 / num2)
        } catch {
            case ex: java.lang.ArithmeticException => "Can't divide by zero."
        } finally {
            // clean up after exception
        }


        println("3 / 1 = " + divideNums(3, 1))
        println("3 / 0 = " + divideNums(3, 0))

        // it looks like the exception message is a return value
        // ... without the println it would not bubble to the console...

        

    } // END OF main
} // END OF ScalaTutorial
