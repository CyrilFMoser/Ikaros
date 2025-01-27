package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_E[C](a: T_B[C, C], b: C, c: T_A) extends T_B[(CC_A,CC_A), C]

val v_a: T_B[(CC_A,CC_A), CC_B] = null
val v_b: Int = v_a match{
  case CC_E(_, _, CC_C()) => 0 
}
}
// This is not matched: (CC_E (CC_B (CC_C (CC_B (CC_B (CC_C Wildcard T_A) T_A) T_A) T_A) (T_B T_A T_A))
//      Wildcard
//      (CC_B (CC_C (CC_B (CC_B (CC_C Wildcard T_A) T_A) T_A) T_A) T_A)
//      (CC_B Wildcard T_A)
//      (T_B (Tuple (CC_A T_A T_A T_A T_A) (CC_A T_A T_A T_A T_A))
//           (CC_B (CC_C (CC_B (CC_B (CC_C Wildcard T_A) T_A) T_A) T_A)
//                 (T_B T_A T_A))))