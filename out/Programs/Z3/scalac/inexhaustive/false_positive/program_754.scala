package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_B[D]) extends T_A[D, Boolean]
case class CC_B[E]() extends T_A[E, Boolean]
case class CC_D() extends T_B[CC_B[Boolean]]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A Int)))