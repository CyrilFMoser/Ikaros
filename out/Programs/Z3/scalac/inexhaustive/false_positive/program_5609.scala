package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte) extends T_A[C, D]

val v_a: CC_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B (CC_D (T_A Boolean) Boolean)
//      (CC_A Char (T_A Char))
//      (CC_B (CC_D Boolean Boolean)
//            (CC_A Char (T_A Char))
//            (CC_B (CC_D Boolean Boolean)
//                  (CC_A Char (T_A Char))
//                  Wildcard
//                  (T_A (CC_D Boolean Boolean)))
//            (T_A (CC_D Boolean Boolean)))
//      (T_A (CC_D (T_A Boolean) Boolean)))