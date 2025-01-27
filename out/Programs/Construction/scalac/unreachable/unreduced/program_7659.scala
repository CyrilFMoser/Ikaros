package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], Byte], b: T_A, c: T_B[T_B[(Boolean,Boolean), T_A], Int]) extends T_A
case class CC_B(a: Char, b: CC_A, c: Boolean) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D(a: Boolean, b: Byte) extends T_B[CC_B, (Boolean,CC_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(CC_B(_, _, _))