object XY {
	object X {
		val value: Int = Y.value + 1
	}
	object Y {
		val value: Int = X.value + 1
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
}