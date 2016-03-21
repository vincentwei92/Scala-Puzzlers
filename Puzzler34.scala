class AirportDay {
	def tryCheckBag(weigth: Int): String = 
		"It's not a full flight, Your bag is OK."
}

class StartOfVacation extends AirportDay {
	override def tryCheckBag(weigth: Int): String = 
		if (weigth > 25)
			"Your bag is too heavy. Please repack it"
		else
			"Your bag is OK."
}


object AirportSim {

	def goToCheckIn(bagWeight: Int)(implicit ad: AirportDay) {
		println(s"The agaent says: ${ad tryCheckBag bagWeight}")
	}

	def main(args: Array[String]): Unit = {
		implicit val quietTuesday = new AirportDay
		goToCheckIn(26)
		implicit val  busyMonday = new StartOfVacation
		goToCheckIn(26)
	}
}

object AirportSim2 extends App {
	
	def goToCheckIn(bagWeight: Int)(implicit ad: AirportDay) {
		println(s"The agaent says: ${ad tryCheckBag bagWeight}")
	}

	implicit val quietTuesday = new AirportDay
	goToCheckIn(26)
	implicit val busyMonday = new StartOfVacation
	goToCheckIn(26)
}