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
	// the first step is to find the implicit parameters
	// here just thinks the implicit parameter of type Numeric[Nothing] cannot found
	// println(applyNMulti(3)(2.0, nextNumber))
	println(applyNCurried(3)(2.0)(nextNumber))
	println(applyNMulti(3)(2.0, nextNumber[Double]))


	// another test

	def nextNum[N](n: N) = n
	// found   : Nothing => Nothing
	// required: Double => Double
  // println(applyNMulti(3)(2.0, nextNum))



	def nextAnyVal[N <: AnyVal](n: N) = n
	applyNCurried(3)(2.0)(nextAnyVal)
	// applyNMulti(3)(2.0, nextAnyVal)

}


object AnotherPuzzler {
	// def Test[T](n: T)(f: (T, T) => T) = f(n, n)
	// def Test[T](n: T,f: (T, T) => T): T at line 25 and
	// def Test[T](n: T)(f: (T, T) => T): T at line 26
	// have same type after erasure: (n: Object, f: Function2)Object

	def Test[T](n: T, f: (T, T) => T) = f(n, n)

  // def Test[T](n: T)(f: (T, T) => T) = f(n, n)


	def add(x: Int, y: Int) = x + y
	def doubleAdd(x: Double, y: Double) = x + y

	Test(1, add)
	//  found   : (Double, Double) => Double
	 // required: (AnyVal, AnyVal) => AnyVal
  // Test(1, doubleAdd)
                // ^
	// one error found

	//[[[Test(1, doubleAdd)]]]
	object NestedTest {
		def Test[T](n: T, f: (T, T) => T) = f(n, n)
		def Test[T](n: T, g: T => T) = g(n)

		def add(x: Int, y: Int) = x + y

		// Magic Time
		// explicit eta expansion is need because overload resolution
		// the overloaded methods has the same "shape"
		// implict eta expansion cannot be carried by the compliler
		// so Test(1, add) cannot type check because add has no type
		Test(1, add _)

	}










	def nextValue[T <: AnyVal](x: T) = x

	val intValue = nextValue(100)
	val doubleValue = nextValue(100.0)
	println(intValue)
	println(doubleValue)



	println(nextValue _)

	// Yet another test 
	// the type is Nothing here, test why.
	val defaultList = List(1,2.0)
}