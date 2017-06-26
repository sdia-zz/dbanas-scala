import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source



object ScalaTutorial {

    // if you don't want a class to be inherited declare it final!
    class Animal(var name: String, var sound: String){
        this.setName(name)

        val id = Animal.newIdNum

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

        def this(name : String){
            this("No name", "No sound")
            this.setName(name)
        }

        def this(){
            this("No name", "No sound")
        }

        override def toString(): String = {
            return "%s with the id %d says %s".format(this.name, this.id, this.sound)
        }
    } // END OF class Animal

    object Animal {
        private var idNumber = 0
        private def newIdNum = { idNumber += 1; idNumber }
    } // END OF object Animal

    class Dog(name: String, sound: String, growl: String) extends Animal (name, sound) {

        def this(name: String, sound: String){
            this("No name", sound, "No growl")
            this.setName(name)
        }

        def this(name: String){
            this("No name", "No sound", "No growl")
            this.setName(name)
        }

        def this(){
            this("No name", "No sound", "No growl")
        }

        override def toString(): String = {
            return "%s with the id %d says %s or %s".format(this.name, this.id, this.sound, this.growl)
        }
    }

    def main(args:Array[String]){
        val rover = new Animal
        rover.setName("Rover")
        rover.setSound("Woof")
        printf("%s says %s!\n", rover.getName, rover.getSound)

        val whiskers = new Animal("Whiskers", "Meow")
        println(s"${whiskers.getName} with the id ${whiskers.id} says ${whiskers.getSound}")
        println(whiskers.toString)

        val spike = new Dog("Spike", "Woof", "Grrrrrrrr")
        println(spike.toString)

    } // END OF main
} // END OF ScalaTutorial
