package Program_28 

object Test {
sealed trait T_A
case class CC_A(a: Byte, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_A(_, _) => 1 
}
}