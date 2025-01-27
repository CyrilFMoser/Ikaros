package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E], c: T_B[E, T_A[E, E]]) extends T_A[T_B[T_B[Int, Char], T_A[Byte, Int]], E]
case class CC_B[F](a: Byte, b: T_A[F, F]) extends T_A[T_B[T_B[Int, Char], T_A[Byte, Int]], F]
case class CC_C[G]() extends T_A[T_B[T_B[Int, Char], T_A[Byte, Int]], G]
case class CC_D[H](a: CC_C[H], b: Char) extends T_B[H, T_A[T_B[Char, (Char,Byte)], CC_C[Boolean]]]

val v_a: T_A[T_B[T_B[Int, Char], T_A[Byte, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}