class QuietType {
	implicit val stringToInt = (_: String).toInt
	println("4" - 2)
}

class OutspokenType {
	implicit val stringToInt: String => Int = _.toInt
	println("4" - 2)
}