package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_D(a: (T_B,T_B), b: T_A) extends T_B
case class CC_F() extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D((_,CC_F()), _) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_A Char)))