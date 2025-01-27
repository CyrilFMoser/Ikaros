package Program_13 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_B() extends T_B
case class CC_C(a: T_B, b: T_A, c: T_B) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard Wildcard (T_A Int))