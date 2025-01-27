package Program_61 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Byte]
case class CC_B(a: T_A[Byte], b: T_A[(Boolean,Boolean)]) extends T_A[Byte]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
}
}
// This is not matched: (CC_C Wildcard (CC_B T_B) Wildcard T_B)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_B()
//  CC_C(_, _, _)
//  CC_D(_)
// }
//