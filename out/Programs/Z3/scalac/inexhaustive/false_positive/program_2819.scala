package Program_31 

object Test {
sealed trait T_A[A]
case class CC_C[D](a: (Byte,Char)) extends T_A[D]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C((0,_)) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)