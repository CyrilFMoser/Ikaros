package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[Int, D]) extends T_A[C, D]
case class CC_B[F, E]() extends T_A[F, E]

val v_a: CC_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Int Int (CC_B Int Int (T_A Int Int)) Wildcard (T_A Int Int))