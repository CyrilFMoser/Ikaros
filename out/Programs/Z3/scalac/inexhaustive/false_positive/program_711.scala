package Program_31 

object Test {
sealed trait T_B[C, D]
case class CC_B[G, H](a: G) extends T_B[G, H]

val v_a: CC_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
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