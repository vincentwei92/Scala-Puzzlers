class Printer(prompter: => Unit) {
	def print(message: String, prompted: Boolean = false) {
		if (prompted) prompter
		println(message)
	}
}

object Puzzler {
	def prompt() {
		print("puzzler$")
	}
	new Printer { prompt } print (message = "Puzzled yet?")
	new Printer { prompt } print (message = "Puzzled yet?", prompted = true)
	val (x, y) = (1,2)
}