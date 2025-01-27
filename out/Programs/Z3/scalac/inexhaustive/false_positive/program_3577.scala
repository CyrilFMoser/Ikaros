package Program_15 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E, F](a: T_A[E, E], b: E) extends T_A[E, CC_A[E, E]]
case class CC_C(a: T_A[Char, Char], b: CC_B[Byte, Byte]) extends T_A[CC_B[Byte, Char], CC_A[CC_B[Byte, Char], CC_B[Byte, Char]]]

val v_a: CC_B[T_A[CC_B[Byte, Char], CC_A[CC_B[Byte, Char], CC_B[Byte, Char]]], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C(_, _)) => 0 
  case CC_B(CC_A(), CC_A()) => 1 
  case CC_B(CC_A(), CC_C(_, _)) => 2 
  case CC_B(_, CC_A()) => 3 
}
}
// This is not matched: (CC_B (T_A (CC_B Byte Char Boolean Boolean Boolean)
//           (CC_A (CC_B Byte
//                       Char
//                       (CC_A Byte Byte (T_A Byte Byte))
//                       Byte
//                       (T_A Byte (CC_A Byte Byte Boolean)))
//                 (CC_B Byte
//                       Char
//                       (CC_A Byte Byte (T_A Byte Byte))
//                       Byte
//                       (T_A Byte (CC_A Byte Byte Boolean)))
//                 Boolean))
//      Byte
//      Wildcard
//      (CC_B (CC_B Byte
//                  Char
//                  (CC_A Byte Byte (T_A Byte Byte))
//                  Byte
//                  (T_A Byte (CC_A Byte Byte Boolean)))
//            Boolean
//            Wildcard
//            (CC_B Byte
//                  Char
//                  (CC_A Byte Byte (T_A Byte Byte))
//                  Byte
//                  (T_A Byte (CC_A Byte Byte Boolean)))
//            (T_A (CC_B Byte
//                       Char
//                       (CC_A Byte Byte (T_A Byte Byte))
//                       Byte
//                       (T_A Byte (CC_A Byte Byte Boolean)))
//                 (CC_A (CC_B Byte
//                             Char
//                             (CC_A Byte Byte (T_A Byte Byte))
//                             Byte
//                             (T_A Byte (CC_A Byte Byte Boolean)))
//                       (CC_B Byte
//                             Char
//                             (CC_A Byte Byte (T_A Byte Byte))
//                             Byte
//                             (T_A Byte (CC_A Byte Byte Boolean)))
//                       Boolean)))
//      (T_A (T_A (CC_B Byte Char Boolean Boolean Boolean)
//                (CC_A (CC_B Byte
//                            Char
//                            (CC_A Byte Byte (T_A Byte Byte))
//                            Byte
//                            (T_A Byte (CC_A Byte Byte Boolean)))
//                      (CC_B Byte
//                            Char
//                            (CC_A Byte Byte (T_A Byte Byte))
//                            Byte
//                            (T_A Byte (CC_A Byte Byte Boolean)))
//                      Boolean))
//           (CC_A (T_A (CC_B Byte Char Boolean Boolean Boolean)
//                      (CC_A (CC_B Byte
//                                  Char
//                                  (CC_A Byte Byte (T_A Byte Byte))
//                                  Byte
//                                  (T_A Byte (CC_A Byte Byte Boolean)))
//                            (CC_B Byte
//                                  Char
//                                  (CC_A Byte Byte (T_A Byte Byte))
//                                  Byte
//                                  (T_A Byte (CC_A Byte Byte Boolean)))
//                            Boolean))
//                 (T_A (CC_B Byte Char Boolean Boolean Boolean)
//                      (CC_A (CC_B Byte
//                                  Char
//                                  (CC_A Byte Byte (T_A Byte Byte))
//                                  Byte
//                                  (T_A Byte (CC_A Byte Byte Boolean)))
//                            (CC_B Byte
//                                  Char
//                                  (CC_A Byte Byte (T_A Byte Byte))
//                                  Byte
//                                  (T_A Byte (CC_A Byte Byte Boolean)))
//                            Boolean))
//                 Boolean)))
// This is not matched: (CC_C T_A)