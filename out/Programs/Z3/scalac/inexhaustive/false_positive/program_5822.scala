package Program_13 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: (Char,Int)) extends T_A[C]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B((_,12)) => 0 
}
}
// This is not matched: (CC_B (CC_B Wildcard T_A) T_A)