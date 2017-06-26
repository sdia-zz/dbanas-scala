import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object ScalaTutorial {

    // a trait is like a java interface in the sense that
    // it is possible to extend multiple traits (*)
    // Unlike java interface traits can provide concrete methods and fields

    // (*) it's not possible to exptend multiple classes -- abstract or not

    trait Flyable {
        def fly: String // abstract method
    }

    trait BulletProof{
        def hitByBullet: String  // abstract method
        def ricochet(startSpeed: Double): String = { // concrete method
            "The bullet ricochets at a speed of %.1f ft/sec".format(startSpeed * .75)
        }
    }

    class Superhero(val name: String) extends Flyable with BulletProof{
        // concretize the abstract methods
        def fly = "%s flyes through the air.".format(this.name)
        def hitByBullet = "The bullet bounces off of %s".format(this.name)
    }

    def main(args: Array[String]){
        val superman = new Superhero("Superman")
        println(superman.fly)
        println(superman.hitByBullet)
        println(superman.ricochet(2500))
    } // END OF main
} // END OF ScalaTutorial
