package Program_11 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: (T_B,T_A)) extends T_A
case class CC_B(a: T_B) extends T_B
case class CC_C() extends T_B
case class CC_D(a: Byte, b: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_A(_)) => 1 
}
}
// This is not matched: CC_B(_)