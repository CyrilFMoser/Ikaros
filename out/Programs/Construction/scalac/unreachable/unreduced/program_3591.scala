package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Char]) extends T_A[Char]
case class CC_B(a: Char, b: T_A[Char]) extends T_A[Char]
case class CC_C(a: T_B[CC_B, Boolean], b: T_A[Char]) extends T_A[Char]
case class CC_D[D](a: Char, b: D) extends T_B[CC_C, D]
case class CC_E[F, E](a: CC_D[T_A[E]]) extends T_B[E, F]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(CC_A(_))) => 1 
  case CC_B(_, CC_A(CC_B(_, _))) => 2 
  case CC_B(_, CC_A(CC_C(_, _))) => 3 
  case CC_B(_, CC_B(_, CC_A(_))) => 4 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 5 
  case CC_B(_, CC_B(_, CC_C(_, _))) => 6 
  case CC_B(_, CC_C(CC_E(_), CC_A(_))) => 7 
  case CC_B(_, CC_C(CC_E(_), CC_B(_, _))) => 8 
  case CC_B(_, CC_C(CC_E(_), CC_C(_, _))) => 9 
  case CC_C(CC_E(CC_D(_, _)), CC_A(CC_A(_))) => 10 
  case CC_C(CC_E(CC_D(_, _)), CC_A(CC_B(_, _))) => 11 
  case CC_C(CC_E(CC_D(_, _)), CC_B(_, _)) => 12 
  case CC_C(CC_E(CC_D(_, _)), CC_C(_, _)) => 13 
}
}
// This is not matched: CC_C(CC_E(CC_D(_, _)), CC_A(CC_C(_, _)))