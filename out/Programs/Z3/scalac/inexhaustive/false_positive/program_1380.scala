package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,Byte)) extends T_A[C, T_A[C, C]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_B Wildcard T_B)