package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], (T_A,T_A)], b: T_A, c: Byte) extends T_A
case class CC_B(a: T_B[((Int,Int),T_A), T_B[CC_A, Boolean]], b: T_B[T_A, CC_A], c: CC_A) extends T_A
case class CC_C[C](a: T_B[C, C], b: CC_A, c: T_A) extends T_B[T_B[C, C], C]
case class CC_D[D](a: D, b: CC_B, c: (Byte,CC_C[T_A])) extends T_B[T_B[D, D], D]
case class CC_E[E](a: Char) extends T_B[T_B[E, E], E]

val v_a: T_B[T_B[CC_B, CC_B], CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, CC_B(_, _, CC_A(_, _, _)), _) => 1 
  case CC_E(_) => 2 
}
}