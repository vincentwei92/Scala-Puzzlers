object CaseMatch {
	val l = List(100, 200, 300)
	l match {
		case _: List[_] => println(l)
		case _ => println("Not a List")
	}

	val x = List(100, 200, 300)
	x match {
		// this following x is assigned locallly
		case x: List[_] => println(x)
		case _ => println("Not a List")
	}

}