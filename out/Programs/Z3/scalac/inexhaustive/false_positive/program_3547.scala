package Program_10 

object Test {
sealed trait T_B[B]
case class CC_B[E]() extends T_B[E]
case class CC_C[F](a: Int, b: Char, c: T_B[F]) extends T_B[F]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_A (T_A (T_A Byte)))