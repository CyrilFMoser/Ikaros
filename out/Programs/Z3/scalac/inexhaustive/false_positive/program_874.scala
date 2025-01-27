package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: D) extends T_A[T_A[D, D], D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_E (CC_B (T_A (T_A Boolean)))
//      (CC_B (T_A Boolean))
//      (CC_E (CC_B (T_A (T_A Boolean)))
//            Wildcard
//            (CC_D (CC_B (T_A (T_A Boolean))) (T_B (CC_B (T_A (T_A Boolean)))))
//            (T_B (CC_B (T_A (T_A Boolean)))))
//      (T_B (CC_B (T_A (T_A Boolean)))))