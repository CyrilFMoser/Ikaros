package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: Byte, b: F, c: Boolean) extends T_A[F, E]
case class CC_B[H, G](a: T_A[G, H], b: T_A[G, H], c: T_B[G, H]) extends T_A[G, H]
case class CC_C[J, I, K](a: CC_B[I, I], b: CC_A[I, K], c: T_B[K, I]) extends T_A[I, J]
case class CC_D(a: T_A[CC_C[Int, Boolean, Int], T_A[Char, Char]]) extends T_B[Byte, T_B[T_A[(Byte,Char), Char], T_A[Boolean, Boolean]]]
case class CC_E(a: Boolean, b: T_A[CC_B[CC_D, CC_D], CC_C[CC_D, CC_D, CC_D]]) extends T_B[Byte, T_B[T_A[(Byte,Char), Char], T_A[Boolean, Boolean]]]
case class CC_F() extends T_B[Byte, T_B[T_A[(Byte,Char), Char], T_A[Boolean, Boolean]]]

val v_a: T_A[T_B[Byte, T_B[T_A[(Byte,Char), Char], T_A[Boolean, Boolean]]], CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(CC_A(_, _, _)), _) => 0 
  case CC_A(_, CC_D(CC_B(_, _, _)), _) => 1 
  case CC_A(_, CC_D(CC_C(_, _, _)), _) => 2 
  case CC_A(_, CC_E(true, _), _) => 3 
  case CC_A(_, CC_E(false, _), _) => 4 
  case CC_A(_, CC_F(), _) => 5 
  case CC_B(_, CC_A(_, _, _), _) => 6 
  case CC_B(_, CC_B(_, _, _), _) => 7 
  case CC_B(_, CC_C(CC_B(_, _, _), _, _), _) => 8 
  case CC_C(CC_B(_, _, _), _, _) => 9 
}
}