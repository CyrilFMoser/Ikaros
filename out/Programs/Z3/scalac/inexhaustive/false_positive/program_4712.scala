package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_B(a: T_A, b: T_B[T_A]) extends T_A
case class CC_C() extends T_B[T_A]
case class CC_D() extends T_B[T_A]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_D()) => 0 
}
}
// This is not matched: Pattern match is empty without constants