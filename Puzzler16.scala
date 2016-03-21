object Puzzler {
	def invert(v3: Int)(v2: Int = 2, v1: Int = 1) {
		println(v1 + ", " + v2 + ", " + v3)
	}

	val invert3 = invert(3) _
	invert3(v1 = 2, v2 = 1)

	def invet(v3: Int, v2: Int, v1: Int) = 
		println(v1 + ", " + v2 + ", " + v3)

	// eta expansion
	val invetFun = invet _
	// placeholder syntax
	// not specifying type argument type here is allowed here
	val invetFun1 = invet(_, _, _)
	// will print 3, 2, 1
	println(invetFun1(v1 = 1, v2 = 2, v3 = 3))
	val invetFunByteShortInt = invet(_: Byte, _: Short, _: Int)

	// must specify argument types here, the only case where you can get away with not specifying argument types
	// is when you pass an underscore for all arguments.
	val invet3 = invet(3, _: Int, _: Int)
	val invet3Short = invet(3, _: Short, _: Short)
	//
	//
	// ******Attention*******
	// First, all the parameter names of the apply method of the Anon Function object is in the forms of (v1, v2, v3, ...)
	// Second, there are default value for the parameters.


}

object SeperateParamsList {
	def area(x: Int)(y: Int = x)(z: Int = x * y) = x * y
	// <synthetic> def area$default$2(x: Int): Int = x;
 //  <synthetic> def area$default$3(x: Int, y: Int): Int = x.*(y);
	val a = area(2)(100)()
	val aa = area(100) _
	val aaa = area(100)()()

}