package Program_13 

object Test {
sealed trait T_A
case class CC_A(a: (Byte,T_A)) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_))) => 0 
}
}
// This is not matched: Pattern match is empty without constants