package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (Char,Char)) extends T_A[D, C]

val v_a: CC_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)