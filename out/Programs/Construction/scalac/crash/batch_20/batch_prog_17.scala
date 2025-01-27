package Program_17 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: Boolean, b: T_A) extends T_A
case class CC_B(a: Int, b: (Byte,CC_A), c: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, (_,CC_A(_, _)), _) => 0 
}
}