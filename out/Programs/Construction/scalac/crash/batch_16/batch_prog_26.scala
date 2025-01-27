package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E, F](a: F, b: T_A[F, E]) extends T_A[F, E]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
}
}