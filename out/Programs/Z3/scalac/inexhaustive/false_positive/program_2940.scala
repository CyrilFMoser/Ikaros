package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E, F](a: T_A[E, E], b: Boolean, c: T_A[F, F]) extends T_A[F, E]

val v_a: CC_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
}
}
// This is not matched: (CC_B T_A)