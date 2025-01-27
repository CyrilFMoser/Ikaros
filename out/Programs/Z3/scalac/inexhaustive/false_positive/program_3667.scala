package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B, T_A[T_B, T_B]]
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_E()) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard (T_A (T_A Char)))