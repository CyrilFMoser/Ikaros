package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: T_A, c: Boolean) extends T_A
case class CC_B(a: T_A, b: (T_A,T_A)) extends T_A
case class CC_C[C](a: C) extends T_B[T_B[T_B[CC_B, T_A], Byte], C]
case class CC_D[D](a: CC_A, b: T_B[D, D], c: CC_C[CC_B]) extends T_B[T_B[T_B[CC_B, T_A], Byte], D]
case class CC_E[E](a: Char) extends T_B[T_B[T_B[CC_B, T_A], Byte], E]

val v_a: T_B[T_B[T_B[CC_B, T_A], Byte], CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _)) => 0 
  case CC_D(CC_A(_, CC_A(_, _, _), _), _, _) => 1 
  case CC_D(CC_A(_, CC_B(_, _), _), _, _) => 2 
  case CC_E('x') => 3 
  case CC_E(_) => 4 
}
}