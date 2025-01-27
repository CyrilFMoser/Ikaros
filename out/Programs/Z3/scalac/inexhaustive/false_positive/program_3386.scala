package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,Byte), b: T_A[C, Int]) extends T_A[C, T_A[C, C]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(('x',_), _) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard Wildcard (T_A Byte))