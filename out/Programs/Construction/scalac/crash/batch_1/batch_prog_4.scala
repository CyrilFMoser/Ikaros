package Program_4 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: (T_B,T_B), b: T_B, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D(a: Boolean) extends T_B
case class CC_E(a: CC_B) extends T_B
case class CC_F(a: CC_B, b: CC_D, c: (CC_C,((Int,Boolean),T_A))) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()