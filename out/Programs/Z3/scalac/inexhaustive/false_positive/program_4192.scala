package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: T_B) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
}
}
// This is not matched: (CC_A Char Char (T_A Char Char))