package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: (Boolean,T_B)) extends T_A[B]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: CC_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_D())) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)