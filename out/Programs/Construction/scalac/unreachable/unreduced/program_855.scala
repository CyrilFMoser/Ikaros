package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B, c: T_B) extends T_A[T_A[T_A[(Char,Byte), T_B], (T_B,T_B)], C]
case class CC_B[D](a: T_B, b: (Char,T_A[T_B, T_B]), c: Int) extends T_A[CC_A[D], D]
case class CC_C[E](a: Char, b: Byte, c: CC_A[E]) extends T_B
case class CC_D(a: T_A[CC_A[(T_B,T_B)], (T_B,T_B)], b: T_A[CC_C[T_B], T_B]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, _) => 1 
  case CC_E() => 2 
}
}