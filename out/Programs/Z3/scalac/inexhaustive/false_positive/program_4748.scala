package Program_14 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
}
}
// This is not matched: (CC_B T_B Wildcard Wildcard Wildcard (T_A T_B))