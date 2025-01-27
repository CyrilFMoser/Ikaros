package Program_60 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char) extends T_A[T_A[Char]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_E Wildcard
//      (CC_E Byte Wildcard Wildcard T_B)
//      (CC_C (CC_A (Tuple Boolean Boolean)
//                  (T_A (Tuple Boolean Boolean) (T_A Int (Tuple Int Byte))))
//            Wildcard
//            (CC_A T_B (T_A T_B (T_A Int (Tuple Int Byte))))
//            T_B)
//      T_B)
// Mutation information: 
// Changing a Wildcard in 0 at pattern position 1 to a constant expression:
// {
//  0
// }
//