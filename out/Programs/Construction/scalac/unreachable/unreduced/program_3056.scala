package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Char, E]
case class CC_B[F](a: Int, b: T_A[F, F]) extends T_A[Char, F]
case class CC_C[G]() extends T_A[Char, G]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}