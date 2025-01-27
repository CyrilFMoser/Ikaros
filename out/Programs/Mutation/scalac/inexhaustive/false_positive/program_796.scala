package Program_63 

package Program_18 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[A](a: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 1 
}
}
// This is not matched: (CC_C T_A (CC_B T_A) T_B)
// Mutation information: 
// Deleted Pattern CC_C(CC_B()) at position 0
// This is not matched: (CC_B Wildcard T_A)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _)
// }
//