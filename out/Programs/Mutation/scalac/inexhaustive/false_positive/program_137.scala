package Program_60 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B(a: (Byte,Char), b: T_B[Int]) extends T_B[T_A[Char, Byte]]

val v_a: T_B[T_A[Char, Byte]] = null
val v_b: Int = v_a match{
  case CC_B((0,_), _) => 0 
}
}
// This is not matched: (CC_A (CC_A (CC_B T_A) T_A) T_A)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_)
// }
//