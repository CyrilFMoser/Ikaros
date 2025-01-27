package Program_31 

package Program_5 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A) extends T_A
case class CC_B(a: T_A, b: T_A, c: CC_A[Int]) extends T_A

val v_a: CC_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _), CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _, _)) => 1 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 2 
  case CC_A(CC_B(_, _, _), CC_B(_, _, _)) => 3 
}
}
// This is not matched: (CC_A (CC_B T_A T_A (CC_A T_A T_A T_A T_A) T_A)
//      Wildcard
//      (CC_A T_A
//            (CC_A T_A
//                  (CC_B (CC_B Wildcard
//                              (CC_A T_A Wildcard Wildcard T_A)
//                              Wildcard
//                              T_A)
//                        Wildcard
//                        (CC_A Int
//                              (CC_B Wildcard Wildcard Wildcard T_A)
//                              Wildcard
//                              T_A)
//                        T_A)
//                  Wildcard
//                  T_A)
//            Wildcard
//            T_A)
//      T_A)
// This is not matched: (CC_C (T_A (Tuple (Tuple Int Boolean) Boolean)))