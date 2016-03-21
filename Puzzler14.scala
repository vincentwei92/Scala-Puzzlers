object Puzzler {
	def sumItUp: Int = {
		def one(x: Int): Int = { return x; 1 }
		val two = (x: Int) => { return x; 2 }
		object N {
			1 + one(2) + two(3)
		}
		N
		1 + one(2) + two(3)
	}
}

object Main {
	def findHotCurrency[A](currencies: Seq[A], threshold: (Double, Double) => Boolean): Option[A] = {
		for (currency <- currencies) {
			val oldRate = 100
			val newRate = 1000
			if (threshold(oldRate, newRate)) return Some(currency)
		}
		None
	}
	println(Puzzler.sumItUp)
}