package Program_14 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_B (T_A Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (CC_A Int Boolean Boolean Boolean)))