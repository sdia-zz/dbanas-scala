import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object ScalaTutorial {

    def main(args: Array[String]){

        // functions can be passed like any other variables, e.g.:
        val log10Func = log10 _ // the underscore is required,
                                // it says we want the function log10 and not the variable if any
        println(log10Func(1000))

        // it is possible to apply a function to all items of a list
        List(10.0, 100.0, 1000.0, 10000.0).map(log10Func).map(println)
        List(10.0, 100.0, 1000.0, 10000.0).map(log10Func).foreach(println)

        // while we are at it... another map example
        List(1,2,3,4,5,6,7,8,9).map((x:Int) => x*50).foreach(println)

        // filter...
        List(1,2,3,4,5,6,7,8,9).filter(_ % 2 == 0).foreach(println)

        // coming back to higher order functions
        // HOF is a function that takes as arguments another function
        // hum I am sceptic, i think HOF returns another function, like currying ...?
        def times3(num: Int) = num * 3
        def times4(num: Int) = num * 4

        def multIt(func: (Int) => Double, num: Int) = {
            func(num)
        }
        printf("4 * 100 = %.1f\n", multIt(times4, 100))
        printf("3 * 100 = %.1f\n", multIt(times3, 100))

        // A closure is a function that depends on a variable defined outside of that function
        val divisorVal = 5
        val divisor5 = (num : Double) => num / divisorVal
        println("125 / 5 = " + divisor5(125.0))

        // btw this is a lambda function: (args:type) => do_sthg(args)





    } // END OF main
} // END OF ScalaTutorial
