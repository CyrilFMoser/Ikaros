package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_C() extends T_A
case class CC_D(a: T_B[T_A], b: T_B[CC_C]) extends T_B[CC_C]
case class CC_E() extends T_B[CC_C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_E() => 0 
  case CC_D(_, CC_D(_, _)) => 1 
}
}
// This is not matched: (CC_A T_A)