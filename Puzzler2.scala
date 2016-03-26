object Puzzler {
	val MONTH = 2; val DAY = 100;
	val SECOND = 12; val HOUR = 24; val MINUTE = 30;

	var (HOUR, MINUTE, SECOND) = (12, 0, 0)
	// note the differences
	val proxy: Any = (12, 0, 0)
	var (HOUR, MINUTE, SECOND) = (12, 0, 0)

	val (HOUR, MINUTE, SECOND) = (1,2,3)

	var (x, y, z) = (1, 2, 3)
	
	val TheAnswer = 12
	def checkGuess(n: Int) = n match {
		case TheAnswer => "Correct"
		case _ => "Wrong"
	}

	val theAnswer = 100
	def checkGuess2(n: Int) = n match {
		case `theAnswer` => "Correct"
		case _ => "Wrong"
	}
}