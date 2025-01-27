package Program_62 

object Test {
sealed trait T_A[A, B]
case class CC_B() extends T_A[Byte, (Char,Int)]
case class CC_C(a: (CC_B,Char)) extends T_A[Byte, (Char,Int)]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((_,'x')) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_B)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_B(_, _)
//  CC_C(_, _, _)
// }
//