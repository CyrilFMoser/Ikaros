package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: C) extends T_A[C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B (CC_E (T_A T_B) (T_A (T_A T_B)) (T_A T_B) (T_A T_B))
//      (CC_C (CC_B T_B
//                  (CC_D Wildcard
//                        (CC_A (Tuple Boolean Byte)
//                              Wildcard
//                              Wildcard
//                              (T_A (Tuple Boolean Byte)))
//                        T_B)
//                  (T_A T_B))
//            T_B)
//      (T_A (CC_E (T_A T_B) (T_A (T_A T_B)) (T_A T_B) (T_A T_B))))