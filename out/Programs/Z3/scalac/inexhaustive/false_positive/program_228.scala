package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Byte,Int)) extends T_A[(Char,Char), T_A[Char, Char]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: (CC_B (Tuple (CC_A T_A) Wildcard) Wildcard T_A)