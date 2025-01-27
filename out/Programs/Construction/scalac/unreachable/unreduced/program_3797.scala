package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[Char, E], b: T_B[E, E]) extends T_A[Char, E]
case class CC_B[F, G]() extends T_A[G, F]
case class CC_C[H]() extends T_B[T_A[T_A[Boolean, Int], CC_B[Char, Boolean]], H]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(), _), _) => 1 
  case CC_A(CC_B(), _) => 2 
  case CC_B() => 3 
}
}