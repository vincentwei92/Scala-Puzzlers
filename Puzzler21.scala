object Puzzler {
	implicit class Padder(val sb: StringBuilder) extends AnyVal {
		def pad2(width: Int) = {
			1 to width - sb.length foreach { sb += '*' }
			sb
		}
	}
	val greeting = new StringBuilder("Hello Kitteh!")
	println(greeting pad2 20)
}
