package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: E, c: (T_B[Char, Boolean],Int)) extends T_A[E]
case class CC_C[F](a: CC_A[F]) extends T_A[F]
case class CC_D[G](a: T_B[G, CC_B[G]]) extends T_B[G, CC_B[G]]
case class CC_E[H](a: CC_D[H], b: T_B[H, CC_B[H]]) extends T_B[H, CC_B[H]]
case class CC_F(a: T_A[CC_C[Int]], b: T_A[CC_B[Byte]]) extends T_B[T_A[CC_C[Int]], CC_B[T_A[CC_C[Int]]]]

val v_a: T_B[T_A[CC_C[Int]], CC_B[T_A[CC_C[Int]]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_)) => 0 
  case CC_D(CC_E(_, _)) => 1 
  case CC_D(CC_F(_, _)) => 2 
  case CC_E(CC_D(_), CC_D(_)) => 3 
  case CC_E(CC_D(_), CC_E(_, _)) => 4 
  case CC_E(CC_D(_), CC_F(_, _)) => 5 
  case CC_F(_, CC_A(_, _)) => 6 
  case CC_F(_, CC_B(_, _, _)) => 7 
}
}
// This is not matched: CC_F(_, CC_C(_))