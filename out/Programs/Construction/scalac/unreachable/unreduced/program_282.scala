package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[T_A], b: T_B[Byte]) extends T_B[T_A]
case class CC_D() extends T_B[T_A]
case class CC_E() extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _), _) => 0 
  case CC_C(CC_D(), _) => 1 
  case CC_C(CC_E(), _) => 2 
  case CC_E() => 3 
}
}
// This is not matched: CC_D()