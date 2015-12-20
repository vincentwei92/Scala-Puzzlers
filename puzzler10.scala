trait TraceHashCode {
	override def hashCode: Int = {
		println(s"TRACE: In hashCode for ${this}")
		super.hashCode
	}
}

object Puzzler {
	case class Country(isoCode: String)
	def newSwitzInst = new Country("CH") with TraceHashCode
// mix in trait at declaration time
	case class CountryWithTrace(isoCode: String) extends
	TraceHashCode
	def newSwitzDecl = CountryWithTrace("CH")
}

case class _Country(isoCode: String)

class Country(isoCode: String) extends
_Country(isoCode: String) with TraceHashCode