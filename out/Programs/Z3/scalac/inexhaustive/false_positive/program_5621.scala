package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, D](a: E) extends T_A[E, D]

val v_a: CC_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B T_A)