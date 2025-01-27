package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: Int) extends T_A[D, T_A[D, D]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)