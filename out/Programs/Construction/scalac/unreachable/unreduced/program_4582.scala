package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Byte, b: T_A[Char, E]) extends T_A[T_B[T_B[Char, Byte], T_A[Byte, (Byte,Boolean)]], E]
case class CC_B[F](a: T_B[F, F], b: F, c: F) extends T_A[T_B[T_B[Char, Byte], T_A[Byte, (Byte,Boolean)]], CC_A[T_A[Int, Boolean]]]
case class CC_C[G, H](a: T_B[G, G]) extends T_B[H, G]

val v_a: T_A[T_B[T_B[Char, Byte], T_A[Byte, (Byte,Boolean)]], CC_A[T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_A(_, _)