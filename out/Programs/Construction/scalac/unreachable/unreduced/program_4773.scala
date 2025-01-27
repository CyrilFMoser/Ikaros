package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Boolean], b: T_B[Boolean, T_A[Boolean]]) extends T_A[T_A[T_A[Char]]]
case class CC_B[D](a: CC_A, b: CC_A) extends T_A[D]
case class CC_C[E]() extends T_A[T_A[T_A[Char]]]
case class CC_D[F](a: T_A[F], b: F) extends T_B[T_B[T_A[CC_A], Char], F]
case class CC_E[G]() extends T_B[T_B[T_A[CC_A], Char], G]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}