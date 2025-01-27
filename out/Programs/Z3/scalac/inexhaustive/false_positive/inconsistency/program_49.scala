package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A, CC_A]) extends T_A
case class CC_C[C]() extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_)), _) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))