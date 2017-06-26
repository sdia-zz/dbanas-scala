import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object ScalaTutorial {
    def main(args:Array[String]){

        val employee = Map("Manager" -> "Bob Smith",
                            "Secretary" -> "Alex Brown")

        // map is immutable by default
        if(employee.contains("Manager"))
            printf("Manager : %s\n", employee("Manager"))

        println("mutable map")
        val customers = collection.mutable.Map(100 -> "Paul", 101 -> "Sally")

        printf("Cust 1 : %s\n", customers(100))
        customers(100) = "Tom Marks"
        customers(102) = "Megan Swift"
        for((k,v) <- customers)
            printf("%d : %s\n", k, v)
    
    }
}
