package Program_63 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_B(a: Byte) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard (T_B T_A Boolean))
// Mutation information: 
// Deleted Pattern CC_B(_) at position 0