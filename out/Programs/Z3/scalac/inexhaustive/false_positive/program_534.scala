package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: D) extends T_A[D, (Char,Int)]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_C (CC_B T_A T_A T_A)
//      (Tuple (CC_B Boolean
//                   (CC_C T_A
//                         (Tuple Wildcard Wildcard)
//                         (CC_C T_A Wildcard Wildcard Int (T_B T_A T_A))
//                         Int
//                         (T_B T_A T_A))
//                   T_A)
//             (CC_B Wildcard Wildcard T_A))
//      Wildcard
//      Wildcard
//      (T_B (CC_B T_A T_A T_A) T_A))