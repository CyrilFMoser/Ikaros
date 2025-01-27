package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_B() extends T_A
case class CC_D(a: (CC_B,Byte)) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D((_,0)) => 0 
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