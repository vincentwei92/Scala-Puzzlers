object Puzzler {
	val zippedLists = (List(1,3,5), List(2,4,6)).zipped
	// the infer
	val (x, y) = zippedLists.find(_._1 > 10).getOrElse(10)
	println(s"Found $x")



	val a: Any = (1,2)
	     //  Puzzler.this.a = new Tuple2$mcII$sp(1, 2);
      // Puzzler.this.x$3 = {
      //   case <synthetic> val x1: Object = (Puzzler.this.a(): Object);
      //   case5(){
      //     if (x1.$isInstanceOf[Tuple2]())
      //       {
      //         <synthetic> val x2: Tuple2 = (x1.$asInstanceOf[Tuple2](): Tuple2);
      //         {
      //           val x1: Object = x2._1();
      //           val y1: Object = x2._2();
      //           matchEnd4(new Tuple2(x1, y1))
      //         }
      //       }
      //     else
      //       case6()
      //   };
      //   case6(){
      //     matchEnd4(throw new MatchError(x1))
      //   };
      //   matchEnd4(x: Tuple2){
      //     x
      //   }
      // };
      // Puzzler.this.x1 = Puzzler.this.x$3._1();
      // Puzzler.this.y1 = Puzzler.this.x$3._2();
	val (x1, y1) = a

	     // Puzzler.this.x$4 = {
      //   case <synthetic> val x1: Object = (Puzzler.this.a(): Object);
      //   case7(){
      //     if (x1.$isInstanceOf[Tuple2]())
      //       {
      //         <synthetic> val x2: Tuple2 = (x1.$asInstanceOf[Tuple2](): Tuple2);
      //         {
      //           val x11: Object = x2._1();
      //           val y11: Object = x2._2();
      //           if (x11.$isInstanceOf[Int]())
      //             {
      //               <synthetic> val x3: Int = (scala.Int.unbox(x11): Int);
      //               if (y11.$isInstanceOf[Int]())
      //                 {
      //                   <synthetic> val x4: Int = (scala.Int.unbox(y11): Int);
      //                   matchEnd6(new Tuple2$mcII$sp(x3, x4))
      //                 }
      //               else
      //                 case8()
      //             }
      //           else
      //             case8()
      //         }
      //       }
      //     else
      //       case8()
      //   };
      //   case8(){
      //     matchEnd6(throw new MatchError(x1))
      //   };
      //   matchEnd6(x: Tuple2){
      //     x
      //   }
      // };
      // Puzzler.this.x11 = Puzzler.this.x$4._1$mcI$sp();
      // Puzzler.this.y11 = Puzzler.this.x$4._2$mcI$sp();
  // private[this] x$4: (Int, Int)
	val (x11: Int, y11: Int) = a

	// compiler error
	// val (x111, y111): (Int, Int) = a



	// compiler error
	// val (c, d): (Int, Int) =
	// 	zippedLists.find(_._1 > 10).getOrElse(10)

	// will thrwo runtime error if type doesnot check
	val (c: Int, d: Int) = zippedLists.find(_._1 > 10).getOrElse(10)

	// compare 
	val (e, f): (Int, Int) = (100, 200)
      // the type of null is NULL, NULL is the subtype of all AnyRef types.
      // so val xxx: (Int, Int) = null passed the compiler.
	val (ee, ff): (Int, Int) = null
	val (g, h) = (100, 200)
}

class A(x: Int) {
	def sy() {
		println(x)
	}
}