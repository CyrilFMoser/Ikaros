package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[E, E], E]
case class CC_B[F, G](a: Char, b: T_A[T_B[G, G], G]) extends T_B[G, F]
case class CC_C[H](a: (CC_A[Int],T_B[(Boolean,Boolean), Byte])) extends T_B[H, T_A[CC_B[Boolean, Boolean], CC_A[Char]]]
case class CC_D[I](a: I, b: Char, c: (T_A[Byte, Byte],T_B[Char, Char])) extends T_B[I, T_A[CC_B[Boolean, Boolean], CC_A[Char]]]

val v_a: T_B[Byte, T_A[CC_B[Boolean, Boolean], CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D(_, _, (_,CC_B(_, _))) => 1 
}
}
// This is not matched: CC_C((CC_A(),CC_B(_, _)))