import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object ScalaTutorial {

    def main(args: Array[String]){

        // write
        val writer = new PrintWriter("/tmp/test.txt")
        writer.write( "some random text\nmore random text...\nagain\nand again.\n")
        writer.close()

        // read
        val textFromFile = Source.fromFile("/tmp/test.txt", "UTF-8")
        val lineIterator = textFromFile.getLines
        for (line <- lineIterator)
            println(line)

        textFromFile.close()
    } // END OF main
} // END OF ScalaTutorial
