package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Char]) extends T_A[(T_B,T_B)]
case class CC_B() extends T_A[(T_B,T_B)]
case class CC_C(a: (CC_B,T_B), b: T_B, c: CC_A) extends T_A[(T_B,T_B)]

val v_a: T_A[(T_B,T_B)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C((_,_), _, CC_A(_)) => 2 
}
}