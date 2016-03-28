class Cat {
	// 
	val dangerous: String = { println("Initializing Cat"); "Cat" }
	println(dangerous)
}

class Tiger(
	override val dangerous: String,
	private var age: Int
	) extends Cat

class Tiger1 extends Cat {
	override val dangerous = "Tiger"
}