package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Byte, b: T_A[E, E], c: E) extends T_A[(Byte,Char), E]
case class CC_B() extends T_A[(Byte,Char), T_A[Boolean, Byte]]
case class CC_E[G]() extends T_B[(CC_B,Byte), G]

val v_a: CC_A[T_A[(Byte,Char), T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
// }
//