package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_B[Char]) extends T_A
case class CC_B(a: Byte, b: Boolean, c: T_B[T_A]) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D[B](a: CC_C, b: Boolean) extends T_B[CC_C]
case class CC_E(a: Char) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _)