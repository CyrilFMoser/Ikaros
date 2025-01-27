package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,Int), b: T_A[C, C]) extends T_A[C, (Boolean,Boolean)]

val v_a: T_A[Byte, (Boolean,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A((_,12), _) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard (CC_B Boolean Byte (T_A Byte Boolean)) (T_A Byte Boolean))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _)
// }
//