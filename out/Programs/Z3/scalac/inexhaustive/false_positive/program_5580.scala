package Program_12 

object Test {
sealed trait T_A[A]
case class CC_B[E](a: (Byte,Byte)) extends T_A[E]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B((0,_)) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)