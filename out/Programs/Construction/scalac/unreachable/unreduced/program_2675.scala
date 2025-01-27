package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Int, (Char,Int)], T_A[Char, Char]]) extends T_A[T_B[Byte, (Byte,Boolean)], T_B[T_A[Byte, Char], T_B[Char, Byte]]]
case class CC_B(a: Byte, b: T_A[T_B[Byte, Boolean], Boolean], c: T_A[T_B[Char, (Byte,Int)], CC_A]) extends T_A[T_B[Byte, (Byte,Boolean)], T_B[T_A[Byte, Char], T_B[Char, Byte]]]
case class CC_C(a: CC_B, b: (T_B[CC_B, CC_A],(CC_A,CC_B)), c: Boolean) extends T_A[T_B[Byte, (Byte,Boolean)], T_B[T_A[Byte, Char], T_B[Char, Byte]]]
case class CC_D[F, E](a: Boolean) extends T_B[E, F]
case class CC_E[G, H](a: G, b: Char, c: ((CC_A,CC_A),CC_A)) extends T_B[T_B[G, G], G]
case class CC_F[I]() extends T_B[T_B[I, I], I]

val v_a: T_A[T_B[Byte, (Byte,Boolean)], T_B[T_A[Byte, Char], T_B[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(0, _, _) => 1 
  case CC_B(_, _, _) => 2 
}
}
// This is not matched: CC_C(CC_B(_, _, _), _, _)