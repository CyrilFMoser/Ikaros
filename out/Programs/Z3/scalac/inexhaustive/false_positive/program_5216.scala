package Program_12 

object Test {
sealed trait T_A
case class CC_C(a: Int) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_B Char Wildcard (T_A Char))