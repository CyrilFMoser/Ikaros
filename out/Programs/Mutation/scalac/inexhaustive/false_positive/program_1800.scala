package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: CC_A[C], b: T_A[C]) extends T_A[C]
case class CC_C(a: T_A[Boolean], b: T_A[Boolean], c: CC_B[Boolean]) extends T_A[CC_A[Byte]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B(_, CC_A())) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_A(_)
//  CC_B(_, _)
// }
//