package Program_11 

object Test {
sealed trait T_A
case class CC_A(a: Byte, b: T_A, c: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Byte Byte Boolean (T_A Byte Byte))