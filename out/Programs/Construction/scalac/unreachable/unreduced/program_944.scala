package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean, b: E) extends T_A[T_A[T_A[Byte, (Int,Int)], T_B[Char, Char]], E]
case class CC_B[F](a: CC_A[F]) extends T_A[T_A[T_A[Byte, (Int,Int)], T_B[Char, Char]], F]
case class CC_C(a: T_A[CC_A[Char], CC_B[Char]], b: T_A[T_B[Int, (Int,Boolean)], CC_B[Boolean]], c: T_A[T_B[Char, Boolean], (Byte,Char)]) extends T_A[T_A[T_A[Byte, (Int,Int)], T_B[Char, Char]], Char]
case class CC_D[G](a: CC_B[G]) extends T_B[Int, T_B[Char, Int]]
case class CC_E[H](a: T_A[H, H], b: H) extends T_B[T_B[H, CC_B[H]], H]
case class CC_F(a: Char, b: T_B[Int, T_B[Char, Int]]) extends T_B[Int, T_B[Char, Int]]

val v_a: T_A[T_A[T_A[Byte, (Int,Int)], T_B[Char, Char]], T_A[T_A[T_A[Byte, (Int,Int)], T_B[Char, Char]], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_)) => 1 
  case CC_A(_, CC_C(_, _, _)) => 2 
  case CC_B(_) => 3 
}
}