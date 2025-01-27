package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, Int], b: Int) extends T_A[E, T_B[Boolean, (Int,Char)]]

val v_a: T_A[Int, T_B[Boolean, (Int,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard T_A) T_A)