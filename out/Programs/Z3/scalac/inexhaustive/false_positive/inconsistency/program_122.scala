package Program_30 

object Test {
sealed trait T_A[B]
sealed trait T_B[C]
case class CC_A(a: T_A[Boolean], b: T_B[Char]) extends T_A[T_A[Int]]
case class CC_B[E]() extends T_B[E]
case class CC_C[F]() extends T_B[F]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_A Int (CC_B Byte (T_A Boolean Int)) Wildcard (T_A Boolean Int))