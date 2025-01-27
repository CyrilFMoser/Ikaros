package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: T_A[C, C], c: Byte) extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, D], b: D, c: Char) extends T_A[D, T_B]
case class CC_C[E]() extends T_A[E, T_A[T_B, CC_A[T_B]]]
case class CC_D(a: T_B) extends T_B
case class CC_E(a: CC_D, b: Byte, c: CC_B[(T_B,CC_D)]) extends T_B
case class CC_F(a: CC_B[T_A[CC_D, T_B]], b: T_A[Boolean, CC_D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_D(CC_D(_))) => 0 
  case CC_D(CC_D(CC_E(_, _, _))) => 1 
  case CC_D(CC_D(CC_F(_, _))) => 2 
  case CC_D(CC_E(CC_D(_), _, _)) => 3 
  case CC_D(CC_F(CC_B(_, _, _), _)) => 4 
  case CC_E(_, _, _) => 5 
  case CC_F(_, _) => 6 
}
}