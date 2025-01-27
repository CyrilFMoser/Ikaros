package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: Char) extends T_A
case class CC_D(a: CC_A, b: T_A) extends T_B[Byte]
case class CC_E(a: CC_C) extends T_B[Byte]
case class CC_F(a: (CC_C,CC_A), b: T_B[Byte]) extends T_B[(T_B[CC_A],CC_C)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _, _), _) => 2 
  case CC_C(CC_C(_, _), _) => 3 
}
}
// This is not matched: CC_C(CC_B(), _)