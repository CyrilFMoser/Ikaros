package Program_9 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: (Boolean,T_B), c: (T_A,T_A)) extends T_A
case class CC_B(a: T_B, b: Int) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
}
}