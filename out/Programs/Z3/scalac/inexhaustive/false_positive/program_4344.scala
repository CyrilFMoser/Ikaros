package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_B Wildcard (CC_A Wildcard (T_A Char)) (CC_C (T_A Char)) (T_A Char))