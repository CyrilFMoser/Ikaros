package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_C[G](a: G) extends T_A[G, T_B[Int, Boolean]]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_D Boolean
//      Wildcard
//      (CC_C (CC_A Boolean Wildcard Wildcard T_A)
//            (CC_B Wildcard
//                  (CC_A Wildcard Wildcard (CC_C Wildcard Wildcard T_A) T_A)
//                  T_A)
//            T_A)
//      (T_B (CC_B T_A T_A T_A) Boolean))