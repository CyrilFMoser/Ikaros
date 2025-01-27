package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: Byte) extends T_A[(Byte,Char), E]

val v_a: CC_A[T_A[(Byte,Char), T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
// }
//