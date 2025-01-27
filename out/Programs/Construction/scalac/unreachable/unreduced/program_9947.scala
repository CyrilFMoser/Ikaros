package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean, b: T_B[Byte]) extends T_A
case class CC_B(a: T_B[T_B[(Byte,Int)]], b: T_A) extends T_A
case class CC_C(a: T_B[CC_A], b: T_B[T_B[CC_A]], c: Int) extends T_B[CC_A]
case class CC_D() extends T_B[CC_A]
case class CC_E(a: T_B[CC_A]) extends T_B[CC_D]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_C(_, _, 12)) => 0 
  case CC_E(CC_D()) => 1 
}
}
// This is not matched: CC_E(CC_C(_, _, _))