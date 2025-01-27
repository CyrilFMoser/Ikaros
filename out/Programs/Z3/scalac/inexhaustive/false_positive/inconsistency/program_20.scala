package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: Byte) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_B (CC_A (Tuple Char Int)
//            (CC_A (Tuple Char Int)
//                  (CC_A (Tuple Char Int)
//                        (CC_A (Tuple Char Int)
//                              Wildcard
//                              Wildcard
//                              (T_A (Tuple Char Int)))
//                        Wildcard
//                        (T_A (Tuple Char Int)))
//                  (CC_A (Tuple Char Int)
//                        (CC_A (Tuple Char Int)
//                              (CC_A (Tuple Char Int)
//                                    Wildcard
//                                    Wildcard
//                                    (T_A (Tuple Char Int)))
//                              Wildcard
//                              (T_A (Tuple Char Int)))
//                        Wildcard
//                        (T_A (Tuple Char Int)))
//                  (T_A (Tuple Char Int)))
//            Wildcard
//            (T_A (Tuple Char Int)))
//      (T_A (CC_A T_B T_B T_B T_B)))