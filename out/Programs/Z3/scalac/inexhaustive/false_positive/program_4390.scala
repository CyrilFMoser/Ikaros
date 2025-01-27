package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[(Boolean,Boolean), T_B[Boolean, Int]]
case class CC_B[E](a: Byte) extends T_A[(CC_A,CC_A), E]
case class CC_D() extends T_B[CC_B[CC_A], (CC_A,CC_A)]

val v_a: CC_B[CC_D] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A Byte
//      Wildcard
//      (CC_A Byte
//            Wildcard
//            (CC_A Byte
//                  Byte
//                  (CC_B Byte Wildcard Wildcard Wildcard (T_A Byte))
//                  (T_A Byte))
//            (T_A Byte))
//      (T_A Byte))