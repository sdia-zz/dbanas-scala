import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object ScalaTutorial {
    def main(args: Array[String]){
        println("Array when you have fix size, otherwise use ArrayBuffer.")

        // Init
        println("array")
        val favNums = new Array[Int](20)
        for(j <- 0 to (favNums.length - 1)) {
            favNums(j) = j
            println(favNums(j))
        }

        // gen
        val favNumsTimes2 = for(num <- favNums) yield num * 2
        favNums.foreach(println)

        // filter
        val favNumsEven = for(num <- favNums if num % 2 == 0) yield num
        favNumsEven.foreach(println)

        // ','.join()
        println("python string.join method...")
        println(favNums.deep.mkString(", "))

        // functions
        println("array functions")
        println("Sum : " + favNums.sum)
        println("Min : " + favNums.min)
        println("Max : " + favNums.max)

        println("sorting")
        val sortedNumsAsc = favNums.sortWith(_<_)
        val sortedNumsDesc = favNums.sortWith(_>_)
        sortedNumsDesc.foreach(println)

        //
        println("multi-dimensional array")
        var multTable = Array.ofDim[Int](10, 10)
        for(i <- 0 to 9){
            for(j <- 0 to 9){
                multTable(i)(j) = i * j
            }
        }
        for(i <- 0 to 9){
            for(j <- 0 to 9){
                printf("%d X %d = %d\n", i, j, multTable(i)(j))
            }
        }

        val friends = Array("Bob", "Tom")
        println("Best friends " + friends(0))
        friends(0) = "Sue"
        println("Best friends " + friends(0))

        //
        println("Array buffer")
        val friends2 = ArrayBuffer[String]()

        // methods
        friends2.insert(0, "Phil")
        friends2 += "Mark"
        friends2 ++= Array("Susy", "Paul")
        friends2.insert(1, "Mike", "Sally", "Sam", "Mary", "Sue")
        friends2.remove(1,2)

        // iter
        var friend : String = ""
        for (friend <- friends2)
            println(friend)
    }
}
