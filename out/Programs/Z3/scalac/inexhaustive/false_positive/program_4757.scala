package Program_11 

object Test {
sealed trait T_A[A]
case class CC_C[D](a: ((Int,Int),Int)) extends T_A[D]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C((_,12)) => 0 
}
}
// This is not matched: (CC_B Boolean (CC_B Wildcard Wildcard Wildcard T_B) Wildcard T_B)