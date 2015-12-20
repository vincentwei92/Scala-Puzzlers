trait A {
	val foo: Int
	val bar: Int = 100
	println("In A: foo: " + foo + ", bar" + bar)
}

class B extends A {
	val foo = 10
	println("In B: foo: " + foo + ", bar: " + bar)
}

class C extends B {
	override val bar = 10
	println("In C: foo: " + foo + ", bar: " + bar)
}