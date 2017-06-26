import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object ScalaTutorial {
    def main(args: Array[String]){

        /*
        // function definition
        def funcName (param1:dataType1, param2:dataType2) : returnType = {
            function body
            return valueToReturn
        }
        */

        def getSum(num1:Int=1, num2:Int=1) : Int = {
            return num1 + num2
        }
        println(getSum())
        println("12 + 34 = " + getSum(12, 34))
        println("12 + 34 = " + getSum(num1=12, num2=34))


        // no return: procedure
        def sayHi(): Unit = { // Unit -> no-return
            println( "Hi how are you ?")
        }
        sayHi
        sayHi()

        def sayHi2(mess:String = "Hi how are you ?"): Unit = {
            println(mess)
        }
        // sayHi2 does not work
        sayHi2()
        sayHi2("comment ca va ?")

        //
        println("variable number of parameters...")
        def getSum2( args : Int* ) : Int = {
            var sum : Int = 0
            for (num <- args) {
                sum += num
            }
            sum  //no need of return ?
        }

        println("Get Sum ver2 = " + getSum2(1,2,3,4,5,6,7,8,9))

        //
        println("recursion")
        def factorial(num : BigInt) : BigInt = {
            if (num <= 1)
                1
            else
                num * factorial(num - 1)
        }

        println("factorial 1 is : " + factorial(1))
        println("factorial 2 is : " + factorial(2))
        println("factorial 5 is : " + factorial(5))
        println("factorial 10 is : " + factorial(10))
    }
}
