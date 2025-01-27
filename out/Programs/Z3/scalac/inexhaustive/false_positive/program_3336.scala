package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_C[G, H](a: (Char,Int)) extends T_A[H, G]

val v_a: CC_C[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_C((_,12)) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)