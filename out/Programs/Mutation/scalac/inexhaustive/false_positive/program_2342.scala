package Program_28 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: T_A) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_))) => 0 
}
}
// This is not matched: (CC_A (CC_B Byte
//            (CC_B Byte
//                  Wildcard
//                  Wildcard
//                  (Tuple Wildcard (CC_A Wildcard Byte (T_A (T_A Int))))
//                  (T_A Byte))
//            Wildcard
//            Wildcard
//            (T_A Byte))
//      Wildcard
//      (T_A (T_A Int)))