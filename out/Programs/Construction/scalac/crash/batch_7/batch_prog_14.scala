package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B) extends T_A
case class CC_B(a: (T_A,Boolean), b: T_B) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_),_), _) => 0 
  case CC_B((CC_B(_, _),_), _) => 1 
}
}