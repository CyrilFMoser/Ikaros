package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[T_B[D, D], D]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C(a: T_A[T_B[Char, Int]]) extends T_A[T_A[T_A[Byte]]]
case class CC_D[F](a: F, b: F, c: Byte) extends T_B[T_A[F], F]
case class CC_E(a: T_B[T_A[Byte], Byte], b: T_B[T_A[Byte], Byte]) extends T_B[T_A[Byte], Byte]
case class CC_F(a: CC_A[T_B[CC_E, (Int,Int)]], b: T_B[T_A[CC_A[(Byte,Int)]], CC_A[(Byte,Int)]], c: Byte) extends T_B[T_A[Byte], Byte]

val v_a: T_B[T_A[Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, _, 0) => 0 
  case CC_D(_, _, _) => 1 
  case CC_E(_, CC_D(_, _, _)) => 2 
  case CC_E(_, CC_E(CC_D(_, _, _), CC_D(_, _, _))) => 3 
  case CC_E(_, CC_E(CC_E(_, _), CC_D(_, _, _))) => 4 
  case CC_E(_, CC_E(CC_F(_, _, _), CC_D(_, _, _))) => 5 
  case CC_E(_, CC_E(CC_D(_, _, _), CC_E(_, _))) => 6 
  case CC_E(_, CC_E(CC_E(_, _), CC_E(_, _))) => 7 
  case CC_E(_, CC_E(CC_F(_, _, _), CC_E(_, _))) => 8 
  case CC_E(_, CC_E(CC_D(_, _, _), CC_F(_, _, _))) => 9 
  case CC_E(_, CC_E(CC_E(_, _), CC_F(_, _, _))) => 10 
  case CC_E(_, CC_E(CC_F(_, _, _), CC_F(_, _, _))) => 11 
  case CC_E(_, CC_F(CC_A(_), CC_D(_, _, _), _)) => 12 
  case CC_F(CC_A(_), CC_D(_, _, _), _) => 13 
}
}