package Program_6 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A, c: Boolean) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
}
}