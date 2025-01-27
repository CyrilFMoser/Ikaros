package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Boolean,Int)) extends T_A[Int]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: (CC_C Wildcard (CC_A (CC_B Wildcard T_A) Wildcard T_A) T_A)