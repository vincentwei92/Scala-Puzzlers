object Oh {
	def overloadA(u: Unit) = "I accept a Unit"
	def overloadA(u: Unit, n: Nothing) = 
		"I accept a Unit and Nothing"

	def overloadB(n: Unit) = "I accept a Unit"
	def overloadB(n: Nothing) = "I accept Nothing"

	println(overloadA(99))
	// println(overloadB(99))
}

object AnotherTest {
	def nonOverloadA(f: () => Any) =
		"I accept a non-arg function (() => Any)"

	def overloadedA(f: () => Any) = 
		"I accept a non-arg function"

	def overloadedA(n: Nothing) =
		"I accept Nothing"

	def overloadedA(f: Int => Any) =
		"I accept a non-arg function (Int => Any)"


	def emptyParamList() = 99
	def use(n: Int) = n + 1

	nonOverloadA(emptyParamList)
	// error: missing argument list for method use in object AnotherTest
	// overloadedA(use)
	overloadedA(use _)
	// overloadedA(emptyParamList)
	val eta = emptyParamList _
}