package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: Byte, b: T_A) extends T_A
case class CC_D(a: T_B[T_B[(Char,Boolean)]]) extends T_B[CC_B]
case class CC_E(a: Byte, b: T_B[CC_B]) extends T_B[T_B[CC_B]]
case class CC_F() extends T_B[T_B[CC_B]]

val v_a: T_B[T_B[CC_B]] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_D(_)) => 0 
  case CC_F() => 1 
}
}