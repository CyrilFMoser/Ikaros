package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Int], Int], b: Char, c: Char) extends T_A[T_B[T_B[Char, Boolean], Int]]
case class CC_B() extends T_A[T_B[T_B[Char, Boolean], Int]]
case class CC_C(a: CC_B, b: T_A[Boolean]) extends T_A[T_B[T_B[Char, Boolean], Int]]
case class CC_D[E, D](a: E, b: CC_C, c: T_A[D]) extends T_B[D, E]
case class CC_E[G, F]() extends T_B[F, G]

val v_a: T_A[T_B[T_B[Char, Boolean], Int]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _) => 1 
}
}
// This is not matched: CC_A(_, _, _)