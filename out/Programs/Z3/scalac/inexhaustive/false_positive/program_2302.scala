package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_B,T_B)]
case class CC_B(a: T_A[Char], b: (CC_A,Int)) extends T_A[(T_B,T_B)]

val v_a: T_A[(T_B,T_B)] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,12)) => 0 
  case CC_A() => 1 
}
}
// This is not matched: (CC_C Byte (CC_B Wildcard T_A) Wildcard T_B)