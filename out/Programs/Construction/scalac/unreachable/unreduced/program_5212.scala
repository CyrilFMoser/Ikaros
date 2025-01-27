package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: Boolean, c: Byte) extends T_A[T_B[(Char,Byte), T_B[Int, Char]], E]
case class CC_B[G, F](a: CC_A[G], b: Boolean, c: T_B[F, T_B[F, G]]) extends T_A[F, G]
case class CC_C[H](a: T_B[H, H], b: H, c: T_A[H, H]) extends T_A[T_B[(Char,Byte), T_B[Int, Char]], H]
case class CC_D(a: T_A[T_A[Byte, Int], T_A[Int, (Char,Int)]], b: T_A[CC_A[Byte], CC_B[Byte, (Boolean,Int)]], c: CC_A[CC_A[Char]]) extends T_B[CC_A[Byte], T_B[CC_B[Int, (Char,Boolean)], CC_B[Int, Char]]]
case class CC_E[I](a: Int, b: Boolean) extends T_B[CC_A[Byte], T_B[CC_B[Int, (Char,Boolean)], CC_B[Int, Char]]]

val v_a: T_B[CC_A[Byte], T_B[CC_B[Int, (Char,Boolean)], CC_B[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _, _), CC_B(_, true, _), CC_A(_, _, _)) => 0 
  case CC_D(CC_B(_, _, _), CC_B(_, false, _), CC_A(_, _, _)) => 1 
  case CC_E(_, _) => 2 
}
}