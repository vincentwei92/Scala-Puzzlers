trait A {
	val audience: String
	println("Hello" + audience)
}

class BMember(a: String = "World") extends A {
	val audience = a
	println("I Repeat: Hello " + audience)
}
// best practice: 
class BConstructor(val audience: String = "World") extends A {
	println("I Repeat: Hello " + audience)
}


class BEarlyDef(a: String = "World") extends {
	val audience = a
} with A {
	println("I Repeat: " + audience)
}
// test val x = xxx usage // the syntax generate { val x = xxx; Type.this.x = x } in the constructor body
class BEarlyDef1(a: String = "World") extends {
	val x = 100
	val audience = a
} with A {
	println("I Repeat: " + audience)
}
// testing initialization order
class BEarlyAndConstructor(val audience: String = "World") extends {
	val ab = 100
} with A {
	println("I Repeat: Hello " + audience)
}

trait AfterA {
	val introduction: String
	println(introduction)
}

class BEvery(val audience: String = "World") extends {
	val introduction = 
		{ println("Evaluating early def"); "Are you there?" }
} with A with AfterA {
	println("I Repeat: Hello " + audience)  
}