object Puzzler {
	import collection.mutable.Buffer

	val accessors1 = Buffer.empty[() => Int]
	val accessors2 = Buffer.empty[() => Int]

	val data = Seq(100, 200, 300)

	var j = 0

	for (i <- 0 until data.length) {
		accessors1 += (() => data(i))
		accessors2 += (() => data(j))
		j += 1
	}

	def fun: () => Int = {
		val i = 100
		var j = 2	
		() => i + j
	}
}