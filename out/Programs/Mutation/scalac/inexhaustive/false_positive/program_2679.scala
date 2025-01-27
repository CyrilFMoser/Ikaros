package Program_1 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      (CC_A Wildcard Wildcard Wildcard T_A)
//      (CC_A Wildcard (CC_B T_A) Wildcard T_A)
//      T_A)
// Mutation information: 
// Deleted Pattern CC_A(_, _, CC_B()) at position 0