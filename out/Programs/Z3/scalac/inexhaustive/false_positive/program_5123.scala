package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B) extends T_A[B]
case class CC_B() extends T_B
case class CC_C() extends T_B

val v_a: CC_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)