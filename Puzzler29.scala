object Scanner {
	trait Console { def display(item: String) }
	trait AlarmHandler extends (() => Unit)
	def scanItem(item: String)(implicit c: Console) {
	c.display(item)
	}
	def hitAlarmButton()(implicit ah: AlarmHandler) { ah() }
}

object NormalMode {
	implicit val ConsoleRenderer = new Scanner.Console {
		def display(item: String) { println(s"Found a ${item}") }
	}
	implicit val DefaultAlarmHandler = new Scanner.AlarmHandler {
		def apply() { println("ALARM! ALARM!") }
	}
}

object TestMode {
	implicit val ConsoleRenderer = new Scanner.Console {
		def display(item: String) { println("Found a detonator") }
	}
	implicit val TestAlarmHandler = new Scanner.AlarmHandler {
		def apply() { println("Test successful. Well done!") }
	}
}

object Puzzler {
	import NormalMode._
	Scanner scanItem "knife"
	Scanner.hitAlarmButton()
	import TestMode._
}