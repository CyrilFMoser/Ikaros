package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: (T_B[(Char,Char), Boolean],T_A[Int, Boolean])) extends T_A[T_B[T_A[Char, Int], Boolean], E]
case class CC_B[F](a: CC_A[F], b: F) extends T_A[T_B[T_A[Char, Int], Boolean], Int]
case class CC_C[G]() extends T_A[G, CC_B[G]]
case class CC_D[H, I](a: Int, b: T_A[Int, I], c: I) extends T_B[H, I]
case class CC_E[K, J, L](a: T_B[J, CC_C[K]], b: CC_C[Int]) extends T_B[K, J]

val v_a: T_B[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(CC_E(CC_D(_, _, _), _), CC_C()) => 1 
  case CC_E(CC_E(CC_E(_, _), _), CC_C()) => 2 
}
}
// This is not matched: CC_E(CC_D(_, _, _), CC_C())