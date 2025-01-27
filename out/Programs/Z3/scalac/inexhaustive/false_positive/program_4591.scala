package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_C(a: Byte) extends T_B[T_B[T_A]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_D T_B)