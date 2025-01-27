package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E, F](a: T_A[E, F]) extends T_A[F, E]

val v_a: CC_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_A Int (T_A Int))