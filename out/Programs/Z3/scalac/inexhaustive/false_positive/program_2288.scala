package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_B() extends T_A
case class CC_C(a: Byte) extends T_B[CC_B]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_B Char (CC_B Char Wildcard (T_A Char)) (T_A Char))