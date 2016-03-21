trait Recipe {
	type T <: AnyVal
	def sugarAmout: T
	def howMuchSugar() {
		println(s"Add ${sugarAmout} tablespoons of sugar")
	}
	println(s"sugarAmout: ${sugarAmout}")
}

object Puzzler {
	val approximateCake = new Recipe {
		type T = Int
		val sugarAmout = 5
	}

	val gourmetCake = new Recipe {
		type T = Double
		val sugarAmout = 5.123
	}


}


trait NutritionalInfo {
	type T <: AnyVal
	var value: T = _
}

trait NutritionalInfo_2 {
	type T <: AnyVal
	// fault
	// val value: T = _
	var value: T = _
}
trait NutritionalInfoNoDefault {
	type T <: AnyVal
	var value: T
}

object NewPuzzler {
	//
	val containsSugar = new NutritionalInfo { type T = Boolean }
	println(containsSugar.value)
	println(!containsSugar.value)

	//	
	val containsSugar2 = new NutritionalInfoNoDefault {
		type T = Boolean
		var value: T = _
	}


	new Test1 {
	}


	new Test2 {
	}

}

// <stable> <accessor> def x(): Int = anon$5.this.x;
// private[this] val x: Int = _;
// <accessor> def Test1$_setter_$x_=(x$1: Int): Unit = {
  // anon$5.this.x = x$1;
  // ()
// };
trait Test1 {
	val x: Int = 100
}



//<accessor> def x(): Int = anon$6.this.x;
//private[this] var x: Int = _;
//@runtime.TraitSetter <accessor> def x_=(x$1: Int): Unit = {
  //anon$6.this.x = x$1;
  //()
//};
trait Test2 {
	var x: Int = 100
}

