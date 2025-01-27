package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[E](a: (Char,Int)) extends T_A[(Byte,Char), E]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B((_,12)) => 0 
}
}
// This is not matched: (CC_A (T_B Char) Char Wildcard Wildcard Wildcard (T_A (T_B Char) Char))