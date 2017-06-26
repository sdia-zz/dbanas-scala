object ScalaTutorial {
  def main(args: Array[String]){

    println("While loop...")
    var i = 0
    while (i <= 10) {
      println(i)
      i += 1
    }

    //
    println("Do-while loop...")    
    i = 0
    do {
      println(i)
      i += 1
    } while (i <= 20)


    //
    println("For loop...")    
    for (i <- 1 to 10)
      println(i)


    //
    println("Looping letters...")
    val randLetters = "hello world today!"
    for (i <- 0 until randLetters.length)
      println(randLetters(i))


    //
    println("Iterating a list")
    val aList = List(1,2,3,4,5,6,7)
    for (i <- aList)
      println("List items " + i)


    //
    println("generators...")
    var evenList = for { i <- 1 to 20
      if ( i % 2 ) == 0
    } yield i

    for (i <- evenList)
      println(i)


    //
    println("double iteration...")
    i = 0
    for ( i <- 1 to 5; j <- 6 to 10 ) {
      println(i + " | " + j)
    }


    //
    println("mimick break and continue statement...")
    def printPrimes(){
      val primeList = List(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
      for ( i <- primeList ) {
        if ( i == 11 ) {
          return  // break
        }

        if ( i!= 1 ) {
          println(i)  // continue
        }
      }
    }

    printPrimes


    //
    println("user input...")
    def ask15() {
      var numberGuess = 0
      do {
        print("Guess number 15 ?")
        numberGuess = readLine.toInt
      } while( numberGuess != 15)
        }
    ask15
  }
}
