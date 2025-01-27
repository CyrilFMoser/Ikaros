package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, (Int,Char)], (T_A,T_A)]) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C(a: Boolean, b: Int) extends T_A
case class CC_D() extends T_B[CC_C, CC_C]
case class CC_E(a: CC_B, b: CC_D) extends T_B[CC_C, CC_C]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}