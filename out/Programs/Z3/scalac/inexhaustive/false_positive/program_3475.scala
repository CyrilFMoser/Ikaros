package Program_14 

object Test {
sealed trait T_A[A]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_A[Char]) extends T_A[F]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
}
}
// This is not matched: (CC_C Wildcard T_A)