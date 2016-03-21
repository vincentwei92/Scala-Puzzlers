object XY {
	val x = 1
	object X {
		val value: Int = Y.value + 1 +  x
	}
	object Y {
		val value: Int = X.value + 1 + x
	}
}

object XY2 {
	lazy val xvalue: Int = yvalue + 1
	lazy val yvalue: Int = xvalue + 1
}

class XY3 {
	object X {
		val value: Int = Y.value + 1
	}
	object Y {
		val value: Int = X.value + 1
	}
	def factorial(n: Int): Int = {
def go(n: Int, acc: Int): Int =
if (n <= 0) acc
else go(n-1, n*acc)
go(n, 1)
}
}