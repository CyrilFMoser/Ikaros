package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Byte, b: T_B[E, E], c: T_A[E, E]) extends T_A[E, T_B[E, T_B[E, E]]]
case class CC_B[F, G](a: T_B[F, G], b: G) extends T_A[F, G]
case class CC_C[I, H](a: T_A[I, I], b: T_A[Byte, H], c: H) extends T_A[H, I]
case class CC_D[J](a: T_A[J, J], b: T_A[J, J]) extends T_B[T_A[CC_A[Boolean], CC_C[Char, (Byte,Boolean)]], J]
case class CC_E(a: Char, b: T_A[CC_A[Byte], CC_A[Char]]) extends T_B[T_A[CC_A[Boolean], CC_C[Char, (Byte,Boolean)]], CC_B[CC_D[Int], CC_C[Char, Byte]]]

val v_a: T_B[T_A[CC_A[Boolean], CC_C[Char, (Byte,Boolean)]], Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _), CC_B(_, 12)) => 0 
  case CC_D(CC_B(_, _), CC_B(_, _)) => 1 
  case CC_D(CC_B(_, _), CC_C(_, _, _)) => 2 
  case CC_D(CC_C(CC_B(_, _), CC_B(_, _), _), CC_B(_, 12)) => 3 
  case CC_D(CC_C(CC_B(_, _), CC_B(_, _), _), CC_B(_, _)) => 4 
  case CC_D(CC_C(CC_B(_, _), CC_B(_, _), _), CC_C(_, _, _)) => 5 
  case CC_D(CC_C(CC_C(_, _, _), CC_B(_, _), _), CC_B(_, 12)) => 6 
  case CC_D(CC_C(CC_C(_, _, _), CC_B(_, _), _), CC_B(_, _)) => 7 
  case CC_D(CC_C(CC_C(_, _, _), CC_B(_, _), _), CC_C(_, _, _)) => 8 
  case CC_D(CC_C(CC_B(_, _), CC_C(_, _, _), _), CC_B(_, 12)) => 9 
  case CC_D(CC_C(CC_B(_, _), CC_C(_, _, _), _), CC_B(_, _)) => 10 
  case CC_D(CC_C(CC_B(_, _), CC_C(_, _, _), _), CC_C(_, _, _)) => 11 
  case CC_D(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_B(_, 12)) => 12 
  case CC_D(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_B(_, _)) => 13 
  case CC_D(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_C(_, _, _)) => 14 
}
}