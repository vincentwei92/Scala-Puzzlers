class SimpleAdder {
	def add(x: Int = 1, y: Int = 2): Int = x + y
}

class AdderWithBonus extends SimpleAdder {
	override def add(y: Int = 3, x: Int = 4): Int = super.add(x, y) + 10
}

object Puzzler {
	val adder: SimpleAdder = new AdderWithBonus
	adder add (y = 0)
	adder add 0
	adder add()

	val t = new Test
}

class Test(val x: Int = 1) {}

trait Functional {}

class Scala {}

object New {
	val x = new Scala with Functional {
		println("Scala Rocks")
	}
}