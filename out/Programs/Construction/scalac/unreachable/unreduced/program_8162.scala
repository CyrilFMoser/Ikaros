package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[T_B[Byte]], c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: Byte, b: Byte, c: CC_A) extends T_B[((CC_C,CC_A),T_A)]
case class CC_E(a: CC_A, b: CC_D, c: CC_C) extends T_B[((CC_C,CC_A),T_A)]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_A(_, CC_A(_, _))) => 0 
  case CC_D(_, _, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_D(_, _, CC_A(_, CC_C())) => 2 
}
}