package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_D(a: Int) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
}
}
// This is not matched: (CC_A T_A
//      Wildcard
//      (CC_A (CC_A T_A T_A T_A T_A (CC_A T_A T_A T_A T_A T_A))
//            Wildcard
//            Wildcard
//            Wildcard
//            T_A)
//      Wildcard
//      T_A)