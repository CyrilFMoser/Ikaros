package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_C[H](a: Byte) extends T_A[H, T_A[H, Boolean]]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_D Int Wildcard Wildcard (T_B Int (T_A Int)))