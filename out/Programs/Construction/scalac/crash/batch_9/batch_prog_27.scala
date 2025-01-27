package Program_27 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_A, c: T_B) extends T_A
case class CC_B(a: Byte, b: Int, c: Int) extends T_A
case class CC_C(a: T_A) extends T_B
case class CC_D(a: Boolean, b: CC_C) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
}
}
// This is not matched: CC_A(_, _, _)