object Puzzler {
	import collection.JavaConverters._
	def javaMap: java.util.Map[String, java.lang.Integer] = {
		val map = 
			new java.util.HashMap[String, java.lang.Integer]()
		map.put("key", null)
		map.put("new", 1)
		map
	}

	val scalaMap = javaMap.asScala
	val scalaTypesMap =
		scalaMap.asInstanceOf[scala.collection.Map[String, Int]]
	println(scalaTypesMap("key") == null)
	println(scalaTypesMap("key") == 0)
	
	println(scalaTypesMap("new") == Integer.valueOf(1))
	println(scalaTypesMap("new") == 1.0)
}

object BoxTest {
	val h = new Integer(100)
	println(h == 100)
}