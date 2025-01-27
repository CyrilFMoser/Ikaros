package Program_63 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_C(a: (Int,(Boolean,Byte)), b: T_A[Char]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((_,(_,0)), _) => 0 
}
}
// This is not matched: (CC_B T_A)
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _, _)
// }
//