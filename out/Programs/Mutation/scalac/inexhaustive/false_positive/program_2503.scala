package Program_31 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: C) extends T_A[C]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_D (T_B (T_B (CC_B T_A T_A T_A T_A))))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _)
//  CC_B(_, _, _)
// }
//