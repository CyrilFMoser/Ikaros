package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_E[C](a: C, b: T_A) extends T_B[C]

val v_a: CC_E[T_A] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_A()) => 0 
}
}
// This is not matched: (CC_A (CC_C T_A) T_A)