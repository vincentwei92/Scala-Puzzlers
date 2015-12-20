trait TraceHashCode {
	override def hashCode: Int = {
		println(s"TRACE: In hashCode for $this")
		super.hashCode
	}
}

abstract case class Country(isoCode: String)

object Country {
	def apply(isoCode: String): Country = 
		new Country(isoCode) with TraceHashCode
}