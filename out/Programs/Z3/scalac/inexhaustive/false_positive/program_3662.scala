package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[D](a: D, b: CC_A[D], c: T_A[D]) extends T_A[D]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)