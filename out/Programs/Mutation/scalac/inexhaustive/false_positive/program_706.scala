package Program_63 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D]) extends T_A[D, T_B[Int]]
case class CC_B[E, F]() extends T_B[E]

val v_a: T_A[Boolean, T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Wildcard
//      (CC_B Boolean Boolean (T_B Boolean))
//      (T_A Boolean (T_B Int)))
// This is not matched: (CC_B Wildcard
//      (CC_B (CC_A T_A) (CC_C Wildcard (Tuple Wildcard Wildcard) T_A) T_A)
//      T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A()
// }
//