object numbercheck {

  def main(args:Array[String]):Unit= {
    var a = 10;
    var b = 20;
    var c = 30;

    if (a > b && a > c) {
      print("a is bigger")
    }
    else if(b > a && b > c)
    {
      print("b is bigger")
    }
    else
    {
      print("c is bigger" )
    }
  }

}
