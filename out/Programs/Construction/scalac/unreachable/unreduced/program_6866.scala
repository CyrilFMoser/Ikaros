package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[T_B, C]
case class CC_B[D](a: Byte, b: T_B, c: T_A[D, D]) extends T_A[T_B, D]
case class CC_C[E](a: E) extends T_A[T_B, E]
case class CC_D() extends T_B
case class CC_E(a: Char, b: T_A[T_B, T_A[T_B, T_B]], c: CC_B[Char]) extends T_B
case class CC_F(a: T_A[T_B, CC_B[CC_E]]) extends T_B

val v_a: CC_F = null
val v_b: Int = v_a match{
  case CC_F(CC_A(_)) => 0 
  case CC_F(CC_B(_, CC_D(), _)) => 1 
  case CC_F(CC_B(_, CC_E(_, _, _), _)) => 2 
  case CC_F(CC_B(_, CC_F(_), _)) => 3 
  case CC_F(CC_C(_)) => 4 
}
}