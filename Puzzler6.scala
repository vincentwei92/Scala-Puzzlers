object Puzzler {
	def applyNMulti[T](n: Int)(arg: T, f: T => T) = 
		(1 to n).foldLeft(arg) { (acc, _) => f(acc) }
	def applyNCurried[T](n: Int)(arg: T)(f: T => T) =
		(1 to n).foldLeft(arg) { (acc, _) => f(acc) }

	def nextInt(n: Int) = n * n + 1

	def nextNumber[N](n: N)(implicit numberOps: Numeric[N]) = 
		numberOps.plus(numberOps.times(n, n), numberOps.one)

	println(applyNMulti(3)(2, nextInt))
	println(applyNCurried(3)(2)(nextInt))
	// println(applyNMulti(3)(2.0, nextNumber))
	println(applyNCurried(3)(2.0)(nextNumber))

	def nextAnyVal[N <: AnyVal](n: N) = n
	applyNCurried(3)(2.0)(nextAnyVal)
	// applyNMulti(3)(2.0, nextAnyVal)

}