package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: (T_A,Int)) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),_)) => 0 
}
}
// This is not matched: (CC_B Int Wildcard (T_A Int))