trait A {
	val foo: Int
	val bar: Int = 10
	println("In A: foo: " + foo + ", bar: " + bar)
}

class B extends A {
	val foo: Int = 25
	println("In B: foo: " + foo + ", bar: " + bar)
}

class C extends {
	override val bar = 99
} with B {
	println("In C: foo: " + foo + ", bar: " + bar)
}
