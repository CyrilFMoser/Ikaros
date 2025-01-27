package Program_31 

object Test {
sealed trait T_A[A]
case class CC_C(a: Int) extends T_A[(Byte,Byte)]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_B (CC_B (CC_A Wildcard T_A)
//            (CC_B (CC_B (CC_A Boolean T_A) Wildcard (CC_A Wildcard T_A) T_A)
//                  (CC_A Wildcard T_A)
//                  Wildcard
//                  T_A)
//            (CC_A Wildcard T_A)
//            T_A)
//      (CC_B (CC_A Boolean T_A)
//            (CC_B (CC_B (CC_A Wildcard T_A) Wildcard Wildcard T_A)
//                  Wildcard
//                  (CC_A Boolean T_A)
//                  T_A)
//            (CC_A Boolean T_A)
//            T_A)
//      Wildcard
//      T_A)