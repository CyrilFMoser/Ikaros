package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, E](a: (Int,Char)) extends T_A[D, E]

val v_a: CC_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)