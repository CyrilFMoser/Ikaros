package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A], b: T_A, c: Byte) extends T_A
case class CC_C(a: T_A, b: Boolean) extends T_B[CC_B]
case class CC_D(a: T_B[Int], b: T_B[Boolean]) extends T_B[CC_B]
case class CC_E(a: Byte, b: T_B[CC_A]) extends T_B[CC_B]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _) => 0 
  case CC_C(CC_B(_, CC_A(), _), _) => 1 
  case CC_C(CC_B(_, CC_B(_, _, _), _), _) => 2 
}
}