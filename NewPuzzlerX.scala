trait A {
	private var x = 100
	private def showX() = println(x)
	
	x = 10000
	def add(a: Int, b: Int) = a + b
}

class B extends A {
	x = 1000
	var x = 10000000
}

object Puzzler {
	val i = Some(1000)
	val r = Some(100) flatMap(x => i)
}