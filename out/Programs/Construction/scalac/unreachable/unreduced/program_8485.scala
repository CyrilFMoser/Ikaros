package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: Boolean, c: T_B[T_B[(Boolean,Boolean), Char], Boolean]) extends T_A
case class CC_B(a: Byte, b: T_A) extends T_A
case class CC_C(a: Boolean, b: T_B[CC_B, CC_A]) extends T_A
case class CC_D[C](a: CC_C) extends T_B[Byte, C]
case class CC_E[D](a: ((T_A,T_A),T_B[CC_B, CC_A]), b: CC_D[D], c: T_A) extends T_B[Byte, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _)