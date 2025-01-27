package Program_31 

object Test {
sealed trait T_A
case class CC_B(a: Char) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A (T_A Int Int)
//      Boolean
//      Wildcard
//      Wildcard
//      (T_A (Tuple Boolean Byte) (T_A Int Int)))