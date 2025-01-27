package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Char, T_A]) extends T_A
case class CC_B(a: Char, b: Byte) extends T_A
case class CC_C(a: Char, b: CC_B, c: Boolean) extends T_A
case class CC_D[C](a: ((Byte,CC_A),T_B[T_A, CC_C])) extends T_B[C, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C('x', _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}
// This is not matched: CC_B(_, _)