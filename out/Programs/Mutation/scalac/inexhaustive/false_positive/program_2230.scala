package Program_1 

object Test {
sealed trait T_A[A]
case class CC_B[C]() extends T_A[C]
case class CC_C[D](a: D, b: CC_B[D], c: T_A[D]) extends T_A[D]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, _)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_, _, _)
// }
//