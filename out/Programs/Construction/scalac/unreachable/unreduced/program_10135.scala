package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_B]
case class CC_B() extends T_A[(T_B,T_B), T_A[CC_A[(Boolean,Byte)], T_B]]
case class CC_C[D](a: CC_B, b: T_A[CC_A[T_A[(Char,Boolean), T_B]], T_B], c: T_A[D, T_B]) extends T_A[D, T_B]
case class CC_D() extends T_B
case class CC_E(a: T_A[T_A[T_B, T_B], T_B], b: T_A[CC_B, T_B]) extends T_B
case class CC_F(a: T_A[CC_A[T_B], T_B], b: T_A[(Boolean,CC_E), T_B], c: CC_E) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_A(_)) => 1 
  case CC_E(_, CC_C(_, _, _)) => 2 
  case CC_F(_, _, _) => 3 
}
}