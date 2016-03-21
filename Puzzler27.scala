object Puzzler {
	def objFromJava: Object = "string"
	def stringFromJava: String = null

	// watch out for the distinctions
	def printLengthIfString(a: AnyRef): Unit = a match {
		case str: String => println(s"String of length ${str.length}")
		case _ => println("Not a string")
	}

	def printLengthIfStringX(a: AnyRef): Unit = a match {
		case null => println("Got a null!")
		case _ => ()
	}

	println(().isInstanceOf[Unit])

}

// 
// scala> null.isInstanceOf[Null]
// <console>:12: error: type Null cannot be used in a type pattern or isInstanceOf test
//        null.isInstanceOf[Null]
//                         ^

// scala> null.isInstanceOf[Nothing]
// <console>:12: error: type Nothing cannot be used in a type pattern or isInstanceOf test
//        null.isInstanceOf[Nothing]