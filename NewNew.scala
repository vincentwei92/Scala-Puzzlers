trait A {
	val a = 100
	val b: Int = 100 + a
}

class B extends A {}

trait C {
	var a: Int = 1
}

class D extends C {}
// [[syntax trees at end of                   cleanup]] // NewNew.scala
// package <empty> {
//   abstract trait A extends Object {
//     <accessor> def A$_setter_$a_=(x$1: Int): Unit;
//     <accessor> def A$_setter_$b_=(x$1: Int): Unit;
//     <stable> <accessor> def a(): Int;
//     <stable> <accessor> def b(): Int
//   };
//   class B extends Object with A {
//     <stable> <accessor> def a(): Int = B.this.a;
//     private[this] val a: Int = _;
//     <stable> <accessor> def b(): Int = B.this.b;
//     private[this] val b: Int = _;
//     <accessor> def A$_setter_$a_=(x$1: Int): Unit = {
//       B.this.a = x$1;
//       ()
//     };
//     <accessor> def A$_setter_$b_=(x$1: Int): Unit = {
//       B.this.b = x$1;
//       ()
//     };
//     def <init>(): B = {
//       B.super.<init>();
//       A$class./*A$class*/$init$(B.this);
//       ()
//     }
//   };
//   abstract trait C extends Object {
//     <accessor> def a(): Int;
//     @runtime.TraitSetter <accessor> def a_=(x$1: Int): Unit
//   };
//   class D extends Object with C {
//     <accessor> def a(): Int = D.this.a;
//     private[this] var a: Int = _;
//     @runtime.TraitSetter <accessor> def a_=(x$1: Int): Unit = {
//       D.this.a = x$1;
//       ()
//     };
//     def <init>(): D = {
//       D.super.<init>();
//       C$class./*C$class*/$init$(D.this);
//       ()
//     }
//   };
//   abstract trait A$class extends  {
//     def /*A$class*/$init$($this: A): Unit = {
//       $this.A$_setter_$a_=(100);
//       $this.A$_setter_$b_=(100.+($this.a()));
//       ()
//     }
//   };
//   abstract trait C$class extends  {
//     def /*C$class*/$init$($this: C): Unit = {
//       $this.a_=(1);
//       ()
//     }
//   }
// }