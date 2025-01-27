package Program_28 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: (T_B,Int), b: T_A) extends T_A
case class CC_B(a: T_B, b: CC_A, c: CC_A) extends T_A
case class CC_C(a: CC_A) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}