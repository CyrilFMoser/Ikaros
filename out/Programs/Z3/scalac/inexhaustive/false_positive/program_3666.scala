package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_C[D](a: D, b: T_A[D]) extends T_A[D]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)