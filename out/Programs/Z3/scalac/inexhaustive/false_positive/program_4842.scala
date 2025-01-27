package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: ((Int,Char),Int)) extends T_A[C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,12)) => 0 
}
}
// This is not matched: (CC_B (CC_B (CC_A Boolean (T_A Int)) (T_A Int)) (T_A Int))