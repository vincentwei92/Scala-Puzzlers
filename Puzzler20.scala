object Puzzler {
	def traceIt[T <: Iterator[_]](it: T) = {
		println(s"TRACE: using iterator '${it}'")
		it
	}

	val msg = "I love Scala"
	println("First match index: " +
		traceIt("a".r.findAllIn(msg)).start)
	println("First match index: " +
		"a".r.findAllIn(msg).start)

}