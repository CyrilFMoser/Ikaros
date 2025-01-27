package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_A], b: Char, c: Boolean) extends T_A
case class CC_B(a: Byte, b: T_A) extends T_A
case class CC_C(a: Boolean, b: T_A) extends T_A
case class CC_D() extends T_B[T_B[T_B[CC_B, T_A], CC_C], CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _)