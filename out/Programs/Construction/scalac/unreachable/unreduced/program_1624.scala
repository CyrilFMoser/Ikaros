package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[(T_A[T_B, T_B],T_B), C]
case class CC_B[D](a: T_A[D, D], b: D, c: D) extends T_A[(T_A[T_B, T_B],T_B), D]
case class CC_C[E](a: Char, b: T_A[E, E], c: E) extends T_A[(T_A[T_B, T_B],T_B), E]
case class CC_D() extends T_B
case class CC_E(a: T_B, b: T_A[T_B, CC_B[Byte]]) extends T_B
case class CC_F(a: CC_B[CC_E]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_D(), _) => 1 
  case CC_E(CC_E(_, _), _) => 2 
  case CC_E(CC_F(_), _) => 3 
}
}
// This is not matched: CC_F(CC_B(_, _, _))