package Program_13 

object Test {
sealed trait T_A
case class CC_A(a: Char) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_C (CC_C (CC_B Boolean Boolean) (CC_B Boolean Boolean) Boolean Boolean)
//      (T_A (CC_B Boolean Boolean))
//      Wildcard
//      (T_B (CC_C (CC_B Boolean Boolean) (CC_B Boolean Boolean) Boolean Boolean)
//           (T_A (CC_B Boolean Boolean))))