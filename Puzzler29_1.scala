object Scanner {
	trait Console { def display(item: String) }
	trait AlarmHandler extends (() => Unit)
	def scanItem(item: String)(implicit c: Console) {
	c.display(item)
	}
	def hitAlarmButton()(implicit ah: AlarmHandler) { ah() }
}

class OperatingMode {
	implicit val ConsoleRenderer = new Scanner.Console {
		def display(item: String) { println(s"Found a ${item}") }
	}
	implicit val DefaultAlarmHandler = new Scanner.AlarmHandler {
		def apply() { println("ALARM! ALARM!") }
	}
}

object NormalMode extends OperatingMode

object TestMode extends OperatingMode {
	implicit override val ConsoleRenderer = new Scanner.Console {
		def display(item: String) { println("Found a detonator") }
	}
	implicit val ConsoleRendererer = ConsoleRenderer
	implicit val TestAlarmHandler = new Scanner.AlarmHandler {
		def apply() { println("Test successful. Well done!") }
	}
}

object Main {
	import NormalMode._
	Scanner scanItem "Knife"
	Scanner.hitAlarmButton()
	import TestMode._
	Scanner scanItem "shoe"
	Scanner.scanItem("shoe")(TestMode.ConsoleRenderer)
	Scanner.hitAlarmButton()
}