package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[Boolean],T_A), b: T_B[(T_A,T_A)]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: (CC_B,T_A)) extends T_A
case class CC_D(a: T_B[CC_B], b: T_A, c: Int) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C((CC_B(),CC_B())) => 2 
  case CC_C((CC_B(),CC_C(_))) => 3 
}
}
// This is not matched: CC_C((CC_B(),CC_A(_, _)))