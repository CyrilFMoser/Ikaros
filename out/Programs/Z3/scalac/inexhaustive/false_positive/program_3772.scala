package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: Char) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_C (CC_A T_B
//            Byte
//            (CC_B T_B T_B (CC_F Int T_B) (CC_F Int T_B) (T_A T_B T_B))
//            Byte
//            Char
//            (T_A T_B Byte))
//      Wildcard
//      Wildcard
//      (T_A (CC_A T_B T_B T_B T_B T_B T_B)
//           (CC_A T_B
//                 T_B
//                 (T_A T_B T_B)
//                 (T_A T_B T_B)
//                 (T_A T_B T_B)
//                 (T_A T_B T_B))))