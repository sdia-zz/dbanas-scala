scala> 10 + 3
res0: Int 13


"my answer " + res0


var myName="derek"
val myAge=40

//var: variable
//val: const



/* multi
   line
   comment
   */

// Datatypes
//Byte : -128 to 127
// Boolean : true | false
// Char : unsigned max vaue 65535
// Short : -32768 to 32767
// Int : -2147483648 to 2147483647
// Long : -9223372036854775808 to 9223372036854775807
// Float : -3.40E38 to 3.40E38
// Double : -1.79E308 to 1.79E308


// Really big integers
val largePrime = BigInt("781297509874230958742938745982375098237059872390542395")


// Big decimals
val pi50 = BigDecimal("3.145.....")



// Completion
var randInt = 1000

randInt.   //tab completion here


// Polymorphism in the repl
"5 + 4 = " + (5 + 4)


// re-assign
randInt += 1
randInt -= 1
randInt /= 2



// import
import scala.math._    //import all from math



// conditionals
var age = 18
val canVote = if(age >= 18)  "yes" else "no"



if ((age >= 5) && (age <= 6)) {
    println("....")
} else if ((age > 6) && (age <= 7)) {
    println("...")
} else {
    println("...")
}




