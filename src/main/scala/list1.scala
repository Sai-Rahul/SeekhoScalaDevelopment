object list1 {

  def main(args:Array[String]):Unit= {
//    val tuple2: (String, Int) = ("John", 25)
//    println(tuple2.productArity);
//    println(tuple2.toString)

    //creating new tuple with modified elements

//    val modifiedTuple : (String, Int) = tuple2.copy(_2=30)
//    println(tuple2._2);
//
//    print(modifiedTuple)

    val setA: Set[Int] = Set(1, 2, 3, 4, 5)
    val setB: Set[Int] = Set( 4,5, 6, 7,8)

    val intersection: Set[Int] = setA.intersect(setB) // Get the intersection of setA and

    println(intersection)
    val union: Set[Int] = setA.union(setB) // Get the union of setA and setB
    println(union)
    val difference: Set[Int] = setB.diff(setA) // Get the elements in setA but not in setB
    println(difference)
    val isSubset: Boolean = setA.subsetOf(setB) // Check if setA is a subset of SetA
    println(isSubset)



  }

}
