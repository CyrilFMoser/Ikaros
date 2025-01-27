package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, Byte]) extends T_A[C, Byte]
case class CC_B() extends T_A[T_A[(Char,Byte), Char], Byte]
case class CC_C() extends T_A[(CC_B,CC_B), Byte]

val v_a: T_A[(CC_B,CC_B), Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_A(_, CC_C()) => 1 
}
}
// This is not matched: (CC_A (Tuple (CC_B Boolean Boolean Boolean) (CC_B Boolean Boolean Boolean))
//      Wildcard
//      (CC_A (Tuple (CC_B Boolean Boolean Boolean)
//                   (CC_B Boolean Boolean Boolean))
//            Wildcard
//            (CC_A (Tuple (CC_B Boolean Boolean Boolean)
//                         (CC_B Boolean Boolean Boolean))
//                  Wildcard
//                  Wildcard
//                  (T_A (Tuple (CC_B Boolean Boolean Boolean)
//                              (CC_B Boolean Boolean Boolean))
//                       Byte))
//            (T_A (Tuple (CC_B Boolean Boolean Boolean)
//                        (CC_B Boolean Boolean Boolean))
//                 Byte))
//      (T_A (Tuple (CC_B Boolean Boolean Boolean) (CC_B Boolean Boolean Boolean))
//           Byte))