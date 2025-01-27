package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_D[D](a: Byte) extends T_B[D, CC_A]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
}
}
// This is not matched: (CC_D Int
//      (CC_E Int
//            (CC_A T_A T_A (T_B T_A T_A))
//            (CC_D (CC_A T_A T_A T_A)
//                  (CC_D (CC_A T_A T_A T_A)
//                        Wildcard
//                        Wildcard
//                        Wildcard
//                        (T_B (CC_A T_A T_A T_A)
//                             (CC_A Wildcard Wildcard Wildcard)))
//                  Wildcard
//                  Byte
//                  (T_B (CC_A T_A T_A T_A) (CC_A T_A T_A T_A)))
//            Wildcard
//            (T_B Int (CC_A T_A T_A (T_B T_A T_A))))
//      Wildcard
//      Wildcard
//      (T_B Int (CC_A T_A T_A T_A)))