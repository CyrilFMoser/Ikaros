package Program_30 

object Test {
sealed trait T_B
case class CC_D(a: Int) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
}
}
// This is not matched: (CC_C (CC_D Boolean Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_B Char) (CC_D Boolean Boolean Boolean Boolean)))