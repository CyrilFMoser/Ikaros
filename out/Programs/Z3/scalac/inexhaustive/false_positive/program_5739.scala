package Program_15 

object Test {
sealed trait T_B
case class CC_C(a: Byte) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_B (CC_A (CC_B (CC_B (CC_A Wildcard Boolean Wildcard T_A) T_A) T_A)
//            Wildcard
//            Wildcard
//            T_A)
//      T_A)