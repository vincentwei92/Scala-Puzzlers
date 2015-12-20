object Puzzler {
	// 
	List(1,2) map { i => i + 1 }
	List(1,2) map { _ + 1}
	List(1,2) map { i => println("Hi"); i + 1 }
	List(1,2) map { println("Hi"); _ + 1 }
	//
	List(1,2) map (i => i + 1)
	List(1,2) map ( _ + 1)
	// false cases
	// List(1,2) map ( i => println("Hi"); i + 1)
	// List(1,2) map ( println("Hi"); _ + 1)
	val regualrFunc = 
		{ a: Any => println("foo"); println(a); "baz" }
	val anonymousFunc = 
		{ println("foo"); println(_: Any); "baz" }
	val confinedFunc = 
		{ println("foo"); { a: Any => println(a) }; "baz" }
	val reFunc =
		{ println("foo"); a: Any => println(a); "baz" }
}