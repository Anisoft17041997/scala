import scala.io.Source

object Main {
  def main(args: Array[String]): Unit = {
    /*
    val filename = "/home/anisoft/Documents/Projects/DataScienceWithPython/data.csv"
    for (line <- Source.fromFile(filename).getLines) {
      println(line)
    }
    */
    readCSVFile();
  }

  def readCSVFile(): Unit = {
    io.Source
      .fromURL("https://gist.githubusercontent.com/Anisoft17041997/f0a5ceb05cb347297b4eb6de6ba704f9/raw/b4116dc3f8d61d5dd5233226f07a1c2dc4c96bea/finance.csv")
      .getLines()
      .mkString("\n")
      //.split(",")   // Décommenter cette ligne pour retirer les virgules
      .foreach(print)
  }

}