object Puzzler {
	import io.StdIn._
	val num = readInt
	val a = if (num > 99) "hello world" else println("Go")

	def update(players: Int): Int = {
		def round(unUpdated: Int, updated: Int, times: Int): Int = {
			if (unUpdated <= 0) times
			else round(unUpdated - 1000 - updated, updated + 1000 + updated, times + 1)
		}
		round(players, 0, 0)
	}
}