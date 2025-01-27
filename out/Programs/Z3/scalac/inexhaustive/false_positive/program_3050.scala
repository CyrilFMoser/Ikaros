package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B(a: Int) extends T_A[CC_A[Int]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)