object Puzzler {
	var x = 0
	lazy val y = 1 / x

	try {
		println(y)
	}
	catch {
		case _: Exception =>
			x = 1
			println(y)
	}

}