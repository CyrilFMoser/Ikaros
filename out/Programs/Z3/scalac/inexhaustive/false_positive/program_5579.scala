package Program_13 

object Test {
sealed trait T_A[A]
case class CC_B[E](a: (Byte,Byte)) extends T_A[E]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((_,0)) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)