import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source



object ScalaTutorial {


    class Animal(var name: String, var sound: String){
        //init
        // function signature and the line below define the constructor
        // check further for how to add other constructors
        this.setName(name)

        // unlike Java, there are no static variables or static methods
        // a companion object is the workaround, check: object Animal ...
        val id = Animal.newIdNum

        //getters, setters
        def getName(): String = name
        def getSound() : String = sound

        def setName(name: String) {
            if(!(name.matches(".*\\d+.*")))
                this.name = name
            else
                this.name = "No name"
        }

        def setSound(sound: String) {
            this.sound = sound
        }

        // it is possible to create other constructors though
        // e.g. if arguments name, sound are missing
        def this(name : String){
            this("No name", "No sound")
            this.setName(name)
        }

        def this(){
            this("No name", "No sound")
        }

        // override a method
        override def toString(): String = {
            return "%s with the id %d says %s".format(this.name, this.id, this.sound)
        }
    } // END OF class Animal


    object Animal { // companion object for static variables and functions
                    // should be same name as the class ...?
        private var idNumber = 0
        private def newIdNum = { idNumber += 1; idNumber }
    } // END OF object Animal


    def main(args:Array[String]){

        // let's use our Animal
        val rover = new Animal
        rover.setName("Rover")
        rover.setSound("Woof")
        printf("%s says %s!\n", rover.getName, rover.getSound)

        val whiskers = new Animal("Whiskers", "Meow")
        println(s"${whiskers.getName} with the id ${whiskers.id} says ${whiskers.getSound}")
        println(whiskers.toString)

    } // END OF main




} // END OF ScalaTutorial
