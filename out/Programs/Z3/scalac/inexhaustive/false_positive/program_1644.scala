package Program_29 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(Int,Int)]) extends T_A
case class CC_B[B, C](a: Byte, b: T_A, c: CC_A) extends T_B[B]
case class CC_C[D](a: CC_B[D, D], b: CC_A) extends T_B[D]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), CC_A(_)) => 0 
  case CC_B(_, CC_A(_), _) => 1 
  case CC_B(0, _, CC_A(_)) => 2 
  case CC_B(_, CC_A(_), CC_A(_)) => 3 
  case CC_B(0, CC_A(_), CC_A(_)) => 4 
  case CC_B(_, _, CC_A(_)) => 5 
  case CC_B(_, _, _) => 6 
}
}
// This is not matched: (CC_B Byte
//      T_A
//      Wildcard
//      Wildcard
//      (CC_A (CC_B (Tuple Int Int)
//                  T_A
//                  Wildcard
//                  Wildcard
//                  (CC_A (CC_C (Tuple Int Int)
//                              Wildcard
//                              (CC_A Wildcard T_A)
//                              (T_B (Tuple Int Int)))
//                        T_A)
//                  (T_B (Tuple Int Int)))
//            T_A)
//      (T_B Byte))
// This is not matched: Pattern match is empty without constants