package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[D, D], b: (T_B,T_A[(Byte,Byte), T_B]), c: C) extends T_A[D, C]
case class CC_B[E]() extends T_A[CC_A[T_A[T_B, T_B], T_B], E]
case class CC_C(a: Char, b: CC_A[T_A[T_B, T_B], Char]) extends T_A[CC_A[T_A[T_B, T_B], T_B], Boolean]
case class CC_D(a: (Byte,T_B), b: Boolean, c: CC_B[CC_B[CC_C]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
}
}