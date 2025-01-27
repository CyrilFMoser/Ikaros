package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[Byte]) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[(T_A,CC_C)]
case class CC_E(a: CC_C) extends T_B[(T_A,CC_C)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_))) => 1 
  case CC_A(CC_A(CC_C())) => 2 
  case CC_A(CC_B(_)) => 3 
  case CC_A(CC_C()) => 4 
  case CC_B(_) => 5 
}
}
// This is not matched: CC_C()