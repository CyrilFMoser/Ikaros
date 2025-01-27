package Program_63 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: Char) extends T_A[C]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B Char Wildcard (T_B Char))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_B(_)
//  CC_C(_, _)
// }
//