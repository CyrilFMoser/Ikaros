package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[G](a: T_B[G, G], b: Boolean) extends T_A[G, T_B[G, G]]
case class CC_C[H](a: CC_A[H, H]) extends T_B[H, T_A[Boolean, T_B[Boolean, Boolean]]]
case class CC_D[I](a: T_B[I, I], b: (Char,T_A[Byte, Boolean]), c: T_A[I, T_A[I, I]]) extends T_B[I, T_A[Boolean, T_B[Boolean, Boolean]]]
case class CC_E(a: T_B[CC_C[Byte], Boolean], b: Int) extends T_B[T_A[T_A[Char, (Byte,Boolean)], CC_A[Char, Byte]], T_A[Boolean, T_B[Boolean, Boolean]]]

val v_a: T_B[T_A[T_A[Char, (Byte,Boolean)], CC_A[Char, Byte]], T_A[Boolean, T_B[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_E(_, 12) => 1 
  case CC_E(_, _) => 2 
}
}
// This is not matched: CC_D(_, _, _)