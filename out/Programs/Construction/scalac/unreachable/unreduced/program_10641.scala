package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Boolean]) extends T_A[T_A[T_B[Int]]]
case class CC_B(a: Int, b: Char) extends T_A[Char]
case class CC_C(a: Char, b: Int) extends T_A[Char]
case class CC_D[C](a: T_A[C]) extends T_B[C]
case class CC_E[D](a: CC_B, b: D) extends T_B[D]
case class CC_F[E](a: T_B[CC_B], b: E) extends T_B[E]

val v_a: T_B[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_F(CC_D(_), CC_B(_, _)) => 1 
  case CC_F(CC_D(_), CC_C(_, _)) => 2 
  case CC_F(CC_E(_, _), CC_B(_, _)) => 3 
  case CC_F(CC_E(_, _), CC_C(_, _)) => 4 
  case CC_F(CC_F(CC_D(_), CC_B(_, _)), CC_B(_, _)) => 5 
  case CC_F(CC_F(CC_D(_), CC_B(_, _)), CC_C(_, _)) => 6 
  case CC_F(CC_F(CC_E(_, _), CC_B(_, _)), CC_B(_, _)) => 7 
  case CC_F(CC_F(CC_E(_, _), CC_B(_, _)), CC_C(_, _)) => 8 
  case CC_F(CC_F(CC_F(_, _), CC_B(_, _)), CC_B(_, _)) => 9 
  case CC_F(CC_F(CC_F(_, _), CC_B(_, _)), CC_C(_, _)) => 10 
}
}
// This is not matched: CC_E(CC_B(_, _), _)