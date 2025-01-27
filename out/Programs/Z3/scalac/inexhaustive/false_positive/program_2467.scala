package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_B[E](a: (Byte,Byte)) extends T_A[(Int,Boolean), E]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B((0,_)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)