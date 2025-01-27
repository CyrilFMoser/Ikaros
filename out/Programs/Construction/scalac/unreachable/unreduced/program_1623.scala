package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_A], b: Char, c: Char) extends T_A
case class CC_B(a: T_A, b: CC_A, c: T_A) extends T_A
case class CC_C(a: Byte, b: Byte) extends T_A
case class CC_D[C](a: T_A, b: C, c: T_B[C, C]) extends T_B[C, Boolean]
case class CC_E[D, E]() extends T_B[D, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)