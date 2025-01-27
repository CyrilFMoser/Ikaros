package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,(Char,Int)), b: T_A[C, C]) extends T_A[C, T_A[C, C]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard T_A)