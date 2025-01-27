package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: ((Int,Byte),Int)) extends T_A[(Byte,Char)]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, (_,12)) => 0 
}
}
// This is not matched: (CC_D (CC_A T_A) (CC_A T_A) (T_B (CC_A T_A) (CC_A T_A)))