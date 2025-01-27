package Program_31 

package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_A[T_B], b: T_A[C]) extends T_A[B]
case class CC_B[D, E](a: T_A[E]) extends T_A[D]
case class CC_C(a: T_A[T_B]) extends T_B

val v_a: CC_B[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
  case CC_B(CC_A(_, CC_B(_))) => 1 
  case CC_B(CC_A(_, CC_A(_, _))) => 1 
}
}
// This is not matched: (CC_B T_B
//      T_B
//      (CC_B T_B
//            (CC_B Boolean (CC_C T_B T_B) T_B T_B)
//            (CC_A (CC_B Boolean (CC_C (T_A T_B) T_B) T_B T_B)
//                  T_B
//                  Wildcard
//                  Wildcard
//                  (T_A (CC_B Boolean (CC_C (T_A T_B) T_B) T_B T_B)))
//            (T_A T_B))
//      (T_A T_B))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _)
//  CC_B(_)
// }
//
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A Byte Char))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _)
//  CC_B(_, _)
// }
//