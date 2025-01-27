package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_A[Char, Boolean], D]
case class CC_B[E](a: E) extends T_A[T_A[Char, Boolean], E]
case class CC_C[F](a: T_A[F, F], b: CC_B[F], c: F) extends T_B[F]
case class CC_D[G]() extends T_B[G]
case class CC_E[H]() extends T_B[H]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(12), 12) => 0 
  case CC_C(_, CC_B(12), _) => 1 
  case CC_C(_, CC_B(_), 12) => 2 
  case CC_C(_, CC_B(_), _) => 3 
  case CC_D() => 4 
  case CC_E() => 5 
}
}