package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: Int, c: T_B) extends T_A[(T_B,T_B)]
case class CC_D() extends T_B
case class CC_F() extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_F()) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)