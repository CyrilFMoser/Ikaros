package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Boolean], b: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: T_B[Char, CC_A], b: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_C[D](a: D, b: T_B[D, D], c: Byte) extends T_B[Byte, D]
case class CC_D[E](a: T_A[Boolean], b: CC_C[E], c: Byte) extends T_B[Byte, E]
case class CC_E(a: Byte) extends T_B[Byte, CC_B]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 0 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _)), CC_A(_, CC_A(_, _))) => 1 
  case CC_A(CC_A(CC_B(_, _), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 2 
  case CC_A(CC_A(CC_B(_, _), CC_B(_, _)), CC_A(_, CC_A(_, _))) => 3 
  case CC_A(CC_B(_, _), CC_A(_, CC_A(_, _))) => 4 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, CC_B(_, _))) => 5 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _)), CC_A(_, CC_B(_, _))) => 6 
  case CC_A(CC_A(CC_B(_, _), CC_A(_, _)), CC_A(_, CC_B(_, _))) => 7 
  case CC_A(CC_A(CC_B(_, _), CC_B(_, _)), CC_A(_, CC_B(_, _))) => 8 
  case CC_A(CC_B(_, _), CC_A(_, CC_B(_, _))) => 9 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_B(_, _)) => 10 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _)), CC_B(_, _)) => 11 
  case CC_A(CC_A(CC_B(_, _), CC_A(_, _)), CC_B(_, _)) => 12 
  case CC_A(CC_A(CC_B(_, _), CC_B(_, _)), CC_B(_, _)) => 13 
  case CC_A(CC_B(_, _), CC_B(_, _)) => 14 
}
}