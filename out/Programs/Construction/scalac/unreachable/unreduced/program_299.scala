package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Char, E]
case class CC_B[F](a: T_A[F, F], b: T_A[Char, F]) extends T_A[Char, F]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}