package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[T_A]) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C(a: T_B[CC_A], b: T_A) extends T_A
case class CC_D(a: Char, b: CC_B, c: CC_C) extends T_B[CC_B]
case class CC_E(a: (T_A,T_B[CC_A])) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}