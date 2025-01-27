package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B) extends T_A
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C()) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_B Wildcard
//                   Wildcard
//                   (CC_A Wildcard
//                         (CC_A Wildcard
//                               (CC_A Wildcard
//                                     (CC_A Wildcard
//                                           (CC_B Wildcard
//                                                 Wildcard
//                                                 (CC_B Wildcard
//                                                       Wildcard
//                                                       Wildcard
//                                                       T_A)
//                                                 T_A)
//                                           Wildcard
//                                           T_A)
//                                     Wildcard
//                                     T_A)
//                               (CC_D (Tuple Byte Byte)
//                                     T_A
//                                     Wildcard
//                                     (T_B (Tuple Byte Byte) T_A))
//                               T_A)
//                         (CC_D (Tuple Byte Byte)
//                               T_A
//                               Wildcard
//                               (T_B (Tuple Byte Byte) T_A))
//                         T_A)
//                   T_A)
//             (CC_B Wildcard
//                   (CC_A Wildcard
//                         (CC_A Wildcard
//                               Wildcard
//                               (CC_C (Tuple Byte Byte)
//                                     T_A
//                                     (T_B (Tuple Byte Byte) T_A))
//                               T_A)
//                         Wildcard
//                         T_A)
//                   (CC_A Wildcard
//                         Wildcard
//                         (CC_C (Tuple Byte Byte)
//                               T_A
//                               (T_B (Tuple Byte Byte) T_A))
//                         T_A)
//                   T_A))
//      Wildcard
//      Wildcard
//      T_A)