import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source



object ScalaTutorial {
    def main(args: Array[String]) {
        val name = "Derek"
        val age = 40
        val weight = 175.5

        // string interpolation
        println(s"Hello $name")
        println(f"I am ${age + 1} and weigh $weight%.2f")

        // strings
        var randSent = "I saw a dragon fly by...."

        println("3rd index : " + randSent(3))
        println(randSent.concat(" and explode."))
        println("hello".equals("hello"))
        println(randSent.equals("hello!"))
        println("dragon's index : " + randSent.indexOf("dragon"))

        val randSentArray = randSent.toArray
        for (v <- randSentArray)
            println(v)
    }
}
