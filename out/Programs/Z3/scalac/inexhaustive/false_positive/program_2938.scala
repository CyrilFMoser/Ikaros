package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[D](a: D, b: T_B) extends T_A[(T_B,T_B), D]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: CC_B[T_B] = null
val v_b: Int = v_a match{
  case CC_B(CC_D(), _) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (CC_A Char (T_A Boolean))))