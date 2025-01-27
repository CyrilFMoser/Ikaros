package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E], c: T_B[E, E]) extends T_A[T_B[E, E], E]
case class CC_B[G, F](a: T_A[T_B[CC_A[G], CC_A[G]], CC_A[G]], b: T_A[T_B[F, F], F], c: Byte) extends T_A[G, F]
case class CC_C[H](a: H, b: T_B[H, H]) extends T_A[H, T_B[H, H]]
case class CC_D[I](a: T_A[I, I], b: T_B[I, I]) extends T_B[I, CC_B[((Int,Boolean),Byte), CC_B[Int, Int]]]
case class CC_E[J](a: T_B[J, J]) extends T_B[J, CC_B[((Int,Boolean),Byte), CC_B[Int, Int]]]

val v_a: T_A[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_B(_, _, _), _, _), CC_A(CC_B(_, _, _), _, _), _) => 0 
  case CC_B(CC_B(_, _, _), CC_A(CC_B(_, _, _), _, _), _) => 1 
  case CC_B(CC_A(CC_B(_, _, _), _, _), CC_B(_, CC_A(_, _, _), _), _) => 2 
  case CC_B(CC_B(_, _, _), CC_B(_, CC_A(_, _, _), _), _) => 3 
  case CC_B(CC_A(CC_B(_, _, _), _, _), CC_B(_, CC_B(_, _, _), _), _) => 4 
  case CC_B(CC_B(_, _, _), CC_B(_, CC_B(_, _, _), _), _) => 5 
  case CC_C(_, _) => 6 
}
}