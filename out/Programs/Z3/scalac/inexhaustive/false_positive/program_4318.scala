package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[E, T_B[E, E]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B T_A T_A)