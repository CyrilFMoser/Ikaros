package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A]) extends T_A
case class CC_C[B]() extends T_B[B]
case class CC_D[C]() extends T_B[C]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_D()) => 0 
}
}
// This is not matched: (CC_A T_A)