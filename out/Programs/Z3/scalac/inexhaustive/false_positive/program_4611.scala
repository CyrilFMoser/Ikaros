package Program_15 

object Test {
sealed trait T_B
case class CC_D(a: (Int,T_B)) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D((12,_)) => 0 
}
}
// This is not matched: (CC_A Byte
//      Boolean
//      (CC_B Byte
//            Boolean
//            Byte
//            (CC_A Char Byte Wildcard Wildcard (T_A Byte Char))
//            Boolean
//            (T_A Boolean Byte))
//      Wildcard
//      (T_A Boolean Byte))