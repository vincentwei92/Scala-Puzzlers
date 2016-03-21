object Puzzler {
	def translate(m: Map[String, String]): Map[String, Int] =
		for ((k, v) <- m) yield (k, v.length)
}