object Puzzler {
	implicit val z1 = 2
	def add(x: Int)(y: Int)(implicit z: Int) = x + y + z
	def addTo(n: Int) = add(n) _

	// implicit val z2 = 3
	val addTo1 = addTo(1)
	addTo(1)

	def addToReturnAnonFun(n: Int) = 
		(y: Int) => (z: Int) => add(n)(y)(z)

}

object Anon {

	def iNeedImplicit(implicit n: Int) = n + 1
	val SIM = { x: Int => y: Int => x + y}

	val anonFunWithImplicitParam = { x: Int =>
		implicit y: Int => x + y + iNeedImplicit }

	val ret1 = anonFunWithImplicitParam(1)(2)
	val ret2 = anonFunWithImplicitParam(1)

}