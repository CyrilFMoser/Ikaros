package Program_28 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B[B](a: CC_A) extends T_B[B]
case class CC_C[C, D](a: CC_B[C], b: T_B[C], c: CC_B[C]) extends T_B[C]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C(_, CC_C(_, _, _), _) => 1 
  case CC_C(_, CC_B(_), _) => 2 
  case CC_C(CC_B(_), CC_C(_, _, _), CC_B(_)) => 3 
  case CC_C(CC_B(_), CC_B(_), _) => 4 
  case CC_C(CC_B(_), _, CC_B(_)) => 5 
  case CC_C(CC_B(_), CC_C(_, _, _), _) => 6 
  case CC_C(CC_B(_), _, _) => 7 
  case CC_C(CC_B(_), CC_B(_), CC_B(_)) => 8 
}
}
// This is not matched: (CC_C Byte
//      T_A
//      (CC_B Byte (CC_A Wildcard T_A) (T_B Byte))
//      (CC_C Byte
//            T_A
//            (CC_B Byte
//                  (CC_A (CC_B T_A
//                              (CC_A (CC_C T_A
//                                          T_A
//                                          Wildcard
//                                          (CC_B T_A Wildcard (T_B T_A))
//                                          Wildcard
//                                          (T_B T_A))
//                                    T_A)
//                              (T_B T_A))
//                        T_A)
//                  (T_B Byte))
//            Wildcard
//            (CC_B Byte (CC_A Wildcard T_A) (T_B Byte))
//            (T_B Byte))
//      Wildcard
//      (T_B Byte))
// This is not matched: Pattern match is empty without constants