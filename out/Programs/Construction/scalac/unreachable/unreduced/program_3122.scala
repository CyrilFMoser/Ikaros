package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[E, T_A[Char, E]], E]
case class CC_B[F](a: F, b: T_B[F, T_B[F, F]]) extends T_B[F, T_B[F, F]]
case class CC_C() extends T_B[T_B[Char, T_B[Char, Char]], T_B[T_B[Char, T_B[Char, Char]], T_B[Char, T_B[Char, Char]]]]
case class CC_D[G, H](a: T_A[H, G], b: H) extends T_B[G, H]

val v_a: T_B[T_B[Char, T_B[Char, Char]], T_B[T_B[Char, T_B[Char, Char]], T_B[Char, T_B[Char, Char]]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), CC_B(_, CC_B(_, _))) => 0 
  case CC_B(CC_B(_, _), CC_B(_, CC_C())) => 1 
  case CC_B(CC_B(_, _), CC_B(_, CC_D(_, _))) => 2 
  case CC_B(CC_B(_, _), CC_C()) => 3 
  case CC_B(CC_B(_, _), CC_D(_, _)) => 4 
  case CC_B(CC_D(_, _), CC_B(_, CC_B(_, _))) => 5 
  case CC_B(CC_D(_, _), CC_B(_, CC_C())) => 6 
  case CC_B(CC_D(_, _), CC_B(_, CC_D(_, _))) => 7 
  case CC_B(CC_D(_, _), CC_C()) => 8 
  case CC_B(CC_D(_, _), CC_D(_, _)) => 9 
  case CC_C() => 10 
  case CC_D(_, CC_D(_, _)) => 11 
}
}