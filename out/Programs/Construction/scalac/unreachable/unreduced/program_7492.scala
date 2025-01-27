package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: T_A[D]) extends T_A[D]
case class CC_B[E](a: Int, b: T_B[E, E]) extends T_A[E]
case class CC_C[F]() extends T_B[CC_B[F], F]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
  case CC_B(_, _) => 2 
}
}