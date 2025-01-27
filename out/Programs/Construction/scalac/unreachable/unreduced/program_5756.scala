package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D) extends T_A[D]
case class CC_B[E](a: E, b: T_A[T_B[E, E]], c: Int) extends T_A[E]
case class CC_C[F, G](a: T_A[G], b: CC_B[G], c: T_A[G]) extends T_A[F]
case class CC_D[H](a: T_A[H], b: H) extends T_B[H, T_B[H, H]]
case class CC_E[I](a: T_B[I, T_B[I, I]], b: Byte) extends T_B[I, Byte]
case class CC_F[J, K](a: CC_D[K]) extends T_B[J, Byte]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _), 12) => 1 
  case CC_B(_, CC_B(_, CC_A(_, _), _), 12) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), 12) => 3 
  case CC_B(_, CC_B(_, CC_C(_, _, _), _), 12) => 4 
  case CC_B(_, CC_C(_, _, _), 12) => 5 
  case CC_B(_, CC_A(_, _), _) => 6 
  case CC_B(_, CC_B(_, CC_A(_, _), _), _) => 7 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 8 
  case CC_B(_, CC_B(_, CC_C(_, _, _), _), _) => 9 
  case CC_B(_, CC_C(_, _, _), _) => 10 
  case CC_C(_, _, _) => 11 
}
}