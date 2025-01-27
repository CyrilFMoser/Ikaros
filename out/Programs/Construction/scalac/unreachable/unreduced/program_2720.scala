package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: Boolean) extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A
case class CC_D[C](a: CC_B, b: T_B[C, T_B[C, C]]) extends T_B[CC_B, C]
case class CC_E[D](a: T_B[CC_B, Boolean]) extends T_B[CC_B, D]

val v_a: T_B[CC_B, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_D(CC_B(_), _)) => 1 
  case CC_E(CC_E(CC_E(_))) => 2 
}
}
// This is not matched: CC_E(CC_E(CC_D(_, _)))