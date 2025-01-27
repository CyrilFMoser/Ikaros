package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: D, c: T_B[D]) extends T_A[T_A[T_A[Int, Int], T_B[Byte]], D]
case class CC_B(a: CC_A[(Int,Int)]) extends T_A[T_A[T_A[Int, Int], T_B[Byte]], T_A[T_B[Boolean], Boolean]]
case class CC_C(a: Int) extends T_A[T_A[T_A[Int, Int], T_B[Byte]], (Byte,CC_B)]
case class CC_D[E](a: CC_A[E]) extends T_B[E]
case class CC_E() extends T_B[(CC_C,T_B[(Byte,Char)])]
case class CC_F() extends T_B[(CC_C,T_B[(Byte,Char)])]

val v_a: T_A[T_A[T_A[Int, Int], T_B[Byte]], T_A[T_B[Boolean], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D(CC_A(_, _, _))) => 0 
  case CC_B(CC_A((_,_), (_,_), _)) => 1 
}
}