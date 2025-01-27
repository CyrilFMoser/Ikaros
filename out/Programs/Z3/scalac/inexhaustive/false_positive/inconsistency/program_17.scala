package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[B]
case class CC_A(a: T_A, b: T_B[(Char,Int)]) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: (CC_A T_A)