package Program_11 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_C (CC_F (Tuple Char Char) Byte (T_B Byte (Tuple Char Char)))
//      (T_A Int (CC_B Boolean)))