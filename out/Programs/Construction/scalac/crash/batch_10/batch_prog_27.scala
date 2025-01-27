package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Char) extends T_A
case class CC_B(a: CC_A, b: Boolean, c: Byte) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
}
}