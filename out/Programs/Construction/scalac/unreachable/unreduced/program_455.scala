package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[Boolean, Boolean], T_A]) extends T_A
case class CC_C() extends T_A
case class CC_D[C, D]() extends T_B[(T_A,CC_C), C]
case class CC_E[E]() extends T_B[(T_A,CC_C), E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()