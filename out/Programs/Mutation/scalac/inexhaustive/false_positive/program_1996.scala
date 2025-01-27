package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[E, D]
case class CC_B() extends T_A[CC_A[Char, Char], T_B[Byte]]
case class CC_C(a: (CC_B,Char)) extends T_A[CC_A[Char, Char], T_B[Byte]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((_,'x')) => 0 
}
}
// This is not matched: (CC_D Byte (Tuple Char Boolean) (T_B Byte (Tuple Char Boolean)))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_D()
// }
//