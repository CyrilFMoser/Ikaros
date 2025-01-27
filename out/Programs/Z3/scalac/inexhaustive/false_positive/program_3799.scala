package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: Char) extends T_A[C, T_A[T_B, T_B]]

val v_a: T_A[Int, T_A[T_B, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_D (CC_A T_A T_A T_A T_A)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (CC_A T_A T_A T_A T_A)))