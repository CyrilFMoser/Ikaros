package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, Char], b: Char) extends T_A[Boolean, T_A[Boolean, Int]]

val v_a: T_A[Boolean, T_A[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_C (T_A (T_A Char)))