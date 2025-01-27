package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[T_A, (T_A,CC_A)], c: Char) extends T_A
case class CC_C[C](a: T_A, b: Char, c: C) extends T_B[C, Byte]
case class CC_D[D](a: D) extends T_B[D, T_B[CC_C[(Boolean,Byte)], CC_B]]
case class CC_E[E](a: E, b: T_A, c: CC_D[E]) extends T_B[E, T_B[CC_C[(Boolean,Byte)], CC_B]]

val v_a: T_B[CC_B, Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_)), _, _) => 0 
  case CC_C(CC_A(CC_B(_, _, _)), _, _) => 1 
  case CC_C(CC_B(_, _, _), _, _) => 2 
}
}