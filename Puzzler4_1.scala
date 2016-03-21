trait A {
	val foo: Int
	def bar: Int = 10
	println("In A: foo: " + foo + ", bar: " + bar)
}
class B extends A {
	val foo: Int = 25
	println("In B: foo: " + foo + ", bar: " + bar)
}
class C extends B {
	override def bar: Int = 99
	println("In C: foo: " + foo + ", bar: " + bar)
}