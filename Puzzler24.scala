object Puzzler {
	def printSortedByDoubleCompare(a: Array[Double]) {
		def ltWithNaNGtAll(x: Double, y: Double) =
			(x compare y) < 0
		// must provide explict eta expansion here
		// because two or more overloaded methods has the same shape
		// so implict eta expansion cannot carried by the compiler
		util.Sorting.stableSort(a, ltWithNaNGtAll _)
		println(a.mkString(" "))
	}
	object NestedTest {
		def Test[T](n: T, f: (T, T) => T) = f(n, n)
		def Test[T](n: T, g: T => T) = g(n)

		def add(x: Int, y: Int) = x + y

		// Magic Time
		// explicit eta expansion is need because overload resolution
		// the overloaded methods has the same "shape"
		// implict eta expansion cannot carried by the compliler
		// so Test(1, add) cannot type check because add has no type
		val (x, y) = (1,2)
		Test(1, add _)

	}
}