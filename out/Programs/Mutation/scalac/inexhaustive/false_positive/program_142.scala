package Program_60 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: (Char,Char)) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,'x')) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_)
// }
//