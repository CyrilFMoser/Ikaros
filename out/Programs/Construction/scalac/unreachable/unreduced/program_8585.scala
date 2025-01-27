package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C](a: C, b: CC_B) extends T_B[CC_A, C]
case class CC_D[D]() extends T_B[CC_A, D]
case class CC_E[E](a: CC_C[E], b: T_B[E, E]) extends T_B[CC_A, E]

val v_a: T_B[CC_A, Int] = null
val v_b: Int = v_a match{
  case CC_C(12, CC_B(CC_A(_))) => 0 
  case CC_C(_, CC_B(CC_A(_))) => 1 
  case CC_C(12, CC_B(CC_B(_))) => 2 
  case CC_D() => 3 
  case CC_E(CC_C(_, CC_B(_)), _) => 4 
}
}
// This is not matched: CC_C(_, CC_B(CC_B(_)))