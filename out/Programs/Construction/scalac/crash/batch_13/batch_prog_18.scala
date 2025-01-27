package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[D, D]) extends T_A[C, D]
case class CC_B[F, E]() extends T_A[E, F]

val v_a: CC_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}