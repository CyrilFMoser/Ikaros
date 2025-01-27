package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B, c: Boolean) extends T_A[C, T_B]
case class CC_B[D](a: T_B, b: T_A[D, T_B], c: Int) extends T_A[D, T_B]
case class CC_C[E](a: CC_A[E]) extends T_A[E, T_B]
case class CC_D(a: CC_C[(Byte,T_B)], b: T_B, c: ((T_B,Byte),CC_A[T_B])) extends T_B
case class CC_E(a: (Int,T_B), b: CC_C[CC_B[Char]], c: CC_D) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_), CC_D(_, _, (_,_)), ((_,_),CC_A(_, _, _))) => 0 
}
}
// This is not matched: CC_D(CC_C(_), CC_E((_,_), CC_C(_), CC_D(_, _, _)), ((_,_),CC_A(_, _, _)))