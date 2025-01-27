package Program_13 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: T_B, b: Int, c: (T_A,CC_A)) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, (CC_A(),_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants