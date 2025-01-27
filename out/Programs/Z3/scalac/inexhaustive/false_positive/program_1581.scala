package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Boolean, C], b: (Byte,Int)) extends T_A[C, T_A[Boolean, Int]]

val v_a: T_A[Boolean, T_A[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, (0,_)) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)