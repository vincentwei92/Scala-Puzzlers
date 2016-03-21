object Puzzler {
	val xs = Seq(Seq("a", "b", "c"), Seq("d", "e", "f"), Seq("g", "h"), Seq("i", "j", "k"))
	// runtime not compiler time
	val yuuuuuuuuuuuus = for (List(x, y, z,k) <- xs) yield x + y + z
	val ys = for (Seq(x, y, z) <- xs) yield x + y + z
	val zs = xs map { case Seq(x, y, z) => x + y + z }

	for (i@j <- 0 to 1) yield i + j
}