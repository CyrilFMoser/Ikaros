package Program_31 

object Test {
sealed trait T_A
case class CC_A(a: Byte) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A (T_A (T_A (Tuple Int Char))))