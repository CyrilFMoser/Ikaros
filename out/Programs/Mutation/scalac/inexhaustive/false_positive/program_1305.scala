package Program_60 

package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[(Int,Boolean)]) extends T_A
case class CC_B[B](a: CC_A, b: T_B[B], c: T_A) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 0 
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_B(_, _, _), _) => 1 
}
}
// This is not matched: (CC_A (CC_B T_A
//            (CC_A Wildcard Wildcard T_A)
//            Wildcard
//            (CC_A (CC_B T_A
//                        Wildcard
//                        Wildcard
//                        (CC_A (CC_A Wildcard Wildcard T_A) Wildcard T_A)
//                        T_A)
//                  Wildcard
//                  T_A)
//            T_A)
//      Wildcard
//      T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _)
//  CC_B(_, _, _)
// }
//
// This is not matched: (CC_A (CC_B Wildcard Wildcard Wildcard T_A)
//      (Tuple Wildcard
//             (CC_B Wildcard (CC_B Wildcard Wildcard Boolean T_A) Wildcard T_A))
//      T_A)