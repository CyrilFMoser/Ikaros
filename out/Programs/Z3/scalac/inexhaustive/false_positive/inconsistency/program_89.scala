package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: T_A[Char], b: C) extends T_A[T_A[C]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_B (CC_B (CC_C Wildcard Wildcard T_A) Wildcard T_A) Wildcard T_A)