package Program_15 

object Test {
sealed trait T_A[A]
case class CC_C(a: Int) extends T_A[(Boolean,Char)]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard (CC_B Wildcard Wildcard Wildcard T_A) T_A)