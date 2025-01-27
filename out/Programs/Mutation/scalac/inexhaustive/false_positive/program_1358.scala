package Program_63 

object Test {
sealed trait T_B[B]
case class CC_B(a: Byte) extends T_B[((Int,Boolean),Boolean)]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_D Int Char Wildcard (T_B Char Int))