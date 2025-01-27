package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[CC_A]]) extends T_B[(T_B[T_A],CC_A)]
case class CC_C() extends T_B[(T_B[T_A],CC_A)]
case class CC_D(a: CC_B, b: CC_A, c: CC_C) extends T_B[(T_B[T_A],CC_A)]

val v_a: T_B[(T_B[T_A],CC_A)] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_D(_, CC_A(), CC_C())