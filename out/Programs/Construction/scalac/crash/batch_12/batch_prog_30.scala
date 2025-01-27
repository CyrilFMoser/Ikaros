package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[T_B[T_A]], b: CC_A) extends T_B[(CC_A,CC_A)]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
}
}