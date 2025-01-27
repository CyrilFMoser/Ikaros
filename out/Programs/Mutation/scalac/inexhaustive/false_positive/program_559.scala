package Program_61 

object Test {
sealed trait T_B[C]
case class CC_C[G](a: G) extends T_B[G]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_C Char Wildcard Int (T_B Char))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_B(_)
//  CC_C(_, _)
// }
//