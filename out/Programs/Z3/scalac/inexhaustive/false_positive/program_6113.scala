package Program_15 

object Test {
sealed trait T_A
case class CC_B(a: Byte) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A (T_A Boolean)
//      (CC_B Char
//            Wildcard
//            (CC_A Char Wildcard Wildcard Wildcard (T_A Char))
//            (T_A (T_A Boolean)))
//      Wildcard
//      Wildcard
//      (T_A (T_A Boolean)))