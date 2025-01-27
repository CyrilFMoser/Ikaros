package Program_31 

package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D, E]() extends T_A[D, C]
case class CC_B(a: Byte, b: CC_A[T_B, T_B, Boolean], c: T_A[T_B, (Boolean,Boolean)]) extends T_B
case class CC_C[F](a: (T_B,CC_B), b: CC_B, c: T_A[F, F]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
  case CC_C(_, _, CC_A()) => 1 
}
}
// This is not matched: (CC_C (CC_A Boolean (T_A (CC_B (T_A T_B T_B) T_B T_B T_B) Boolean) Boolean T_B)
//      Wildcard
//      Wildcard
//      (CC_A (CC_A Boolean
//                  (T_A (CC_B (T_A T_B T_B) T_B T_B T_B) Boolean)
//                  Boolean
//                  T_B)
//            (CC_A Boolean (T_A (CC_B T_B T_B T_B T_B) Boolean) Boolean T_B)
//            T_B
//            (T_A (CC_A Boolean (T_A (CC_B T_B T_B T_B T_B) Boolean) Boolean T_B)
//                 (CC_A Boolean
//                       (T_A (CC_B (T_A T_B T_B) T_B T_B T_B) Boolean)
//                       Boolean
//                       T_B)))
//      T_B)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A()
// }
//
// This is not matched: (CC_D Wildcard Wildcard (CC_E T_B) T_B)
// Mutation information: 
// Deleted Pattern CC_E() at position 0