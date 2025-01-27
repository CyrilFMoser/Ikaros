package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[G, F](a: T_A[F, G], b: T_A[G, G], c: T_A[F, F]) extends T_A[F, G]

val v_a: CC_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, CC_A(), _)) => 0 
}
}
// This is not matched: CC_A()