package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean) extends T_A
case class CC_B(a: T_B[T_B[CC_A]], b: CC_A) extends T_A
case class CC_C(a: T_A, b: CC_A, c: Byte) extends T_A
case class CC_D(a: Byte, b: CC_B, c: Boolean) extends T_B[T_B[(CC_C,CC_A)]]
case class CC_E(a: Char, b: CC_C) extends T_B[T_B[(CC_C,CC_A)]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_C(CC_B(_, _), CC_A(_), _) => 2 
  case CC_C(CC_C(_, _, _), CC_A(_), _) => 3 
}
}
// This is not matched: CC_C(CC_A(_), CC_A(_), _)