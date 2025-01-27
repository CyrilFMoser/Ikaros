package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(Char,T_B)]
case class CC_B(a: T_B, b: T_A[CC_A]) extends T_A[(Char,T_B)]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: T_A[(Char,T_B)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_D(), _) => 1 
}
}
// This is not matched: (CC_A Wildcard (T_A (Tuple Char T_B)))