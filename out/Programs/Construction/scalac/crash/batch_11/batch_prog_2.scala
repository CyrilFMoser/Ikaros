package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E](a: T_A[Char, E]) extends T_A[Char, E]
case class CC_C[F]() extends T_A[Char, F]

val v_a: CC_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}