package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Char], b: C) extends T_A[C, T_A[Boolean, C]]

val v_a: T_A[Int, T_A[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard (T_A (CC_B Boolean Boolean)))