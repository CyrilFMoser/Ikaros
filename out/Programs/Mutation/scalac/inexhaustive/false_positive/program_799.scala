package Program_63 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: (Boolean,Byte)) extends T_A[(Byte,Byte)]

val v_a: T_A[(Byte,Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,0)) => 0 
}
}
// This is not matched: (CC_B (CC_A T_A) (CC_A T_A) (Tuple Char (CC_A T_A)) T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A()
// }
//