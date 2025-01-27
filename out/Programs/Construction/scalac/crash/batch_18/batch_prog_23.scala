package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char, b: Int, c: T_A) extends T_A
case class CC_B(a: T_B[T_A, CC_A], b: T_B[CC_A, T_B[T_A, T_A]]) extends T_B[T_B[((Boolean,Byte),(Boolean,Char)), Byte], T_A]
case class CC_C(a: CC_B, b: Boolean, c: T_B[T_B[(Byte,Boolean), Boolean], CC_B]) extends T_B[T_B[((Boolean,Byte),(Boolean,Char)), Byte], T_A]
case class CC_D() extends T_B[T_B[((Boolean,Byte),(Boolean,Char)), Byte], T_A]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _), _, _) => 0 
}
}