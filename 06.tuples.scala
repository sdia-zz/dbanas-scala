import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source



object ScalaTutorial {
    def main(args: Array[String]) {

        println("Tuples hold value of various types, they are immutable.")

        var tupleMarge = (103, "Marge Simpson", 10.25)
        printf("%s owes us $%.2f\n", tupleMarge._2, tupleMarge._3)

        // __repr__ ?
        println(tupleMarge.toString())

        // iter
        tupleMarge.productIterator.foreach(println)
        tupleMarge.productIterator.foreach{i => println(i)}
    }
}
