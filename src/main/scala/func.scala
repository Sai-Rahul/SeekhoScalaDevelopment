object func {

  def main(args: Array[String]): Unit = {
    def printNumbersFromOneToHundred() = {
      val range = 1 to 100;
      for (i <- range)
        {
          println(i)
        }
    }
    printNumbersFromOneToHundred()
  }
}
