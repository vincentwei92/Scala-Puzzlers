object Puzzler {
	var x = 0
	def counter() = { x += 1; x }
	def add(a: Int)(b: Int) = a + b
	// Actually, the underscore in this case is an example of placeholder syntax
	// a => add(counter)(a)
	val adder1 = add(counter)(_)
	// This expression is an example of a partially applied function, since the parameter b of method add is not supplied
	// Thus, eta expansion takes place to convert the method into a function of the remaining parameters
	val adder2 = add(counter) _

}