package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Char,T_B[Byte, Boolean]), b: T_B[E, E], c: Byte) extends T_A[T_B[Boolean, Byte], E]
case class CC_B(a: T_B[T_A[Boolean, Byte], T_B[Int, Byte]], b: T_B[T_A[Boolean, Boolean], Char], c: (Int,CC_A[Char])) extends T_A[T_B[Boolean, Byte], CC_A[T_A[Boolean, Boolean]]]
case class CC_C(a: CC_A[Int], b: T_A[T_B[Boolean, Byte], T_B[(Byte,Boolean), CC_B]], c: T_B[CC_B, T_B[CC_B, CC_B]]) extends T_A[T_B[Boolean, Byte], T_B[Char, T_B[CC_B, Byte]]]
case class CC_D[G, F](a: T_A[G, G], b: T_A[T_B[Boolean, Byte], G]) extends T_B[G, F]
case class CC_E[H, I](a: I, b: T_B[H, I]) extends T_B[H, I]

val v_a: T_A[T_B[Boolean, Byte], T_B[Char, T_B[CC_B, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_D(_, _)), CC_D(_, _), _) => 0 
  case CC_A((_,CC_D(_, _)), CC_E(_, _), _) => 1 
  case CC_A((_,CC_E(_, _)), CC_D(_, _), _) => 2 
  case CC_A((_,CC_E(_, _)), CC_E(_, _), _) => 3 
  case CC_C(_, _, _) => 4 
}
}