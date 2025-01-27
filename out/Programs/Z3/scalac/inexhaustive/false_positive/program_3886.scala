package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: (Byte,Int)) extends T_A[D, T_A[D, D]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B((0,_)) => 0 
}
}
// This is not matched: (CC_D (CC_A T_A) Wildcard Wildcard (T_B (CC_A T_A)))