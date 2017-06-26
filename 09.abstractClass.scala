import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source



object ScalaTutorial {

    // an abstract class cant be instantiated
    // an abstract class is made both with abstract and concrete methods
    abstract class Mammal(val name: String){
        var moveSpeed: Double  // this is an abstract field
        def move: String  // this is an abstract method
    }

    class Wolf(name: String) extends Mammal(name){
        var moveSpeed = 35.0
        def move = "The wolf %s runs %.2f mph".format(this.name, this.moveSpeed)
    }

    def main(args: Array[String]){
        val fang = new Wolf("Fang")
        fang.moveSpeed = 36.0
        println(fang.move)
    } // END OF main
} // END OF ScalaTutorial
