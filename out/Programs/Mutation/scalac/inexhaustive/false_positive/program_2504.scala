package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: CC_A[C], b: C, c: T_A[C]) extends T_A[C]
case class CC_C[D]() extends T_A[D]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_C()) => 0 
}
}
// This is not matched: (CC_D (T_B (T_B (CC_B T_A T_A T_A T_A))))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _)
//  CC_B(_, _, _)
// }
//