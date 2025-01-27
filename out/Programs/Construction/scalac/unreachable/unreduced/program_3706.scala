package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Boolean], b: Byte) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C() extends T_A[T_B]
case class CC_D[B]() extends T_B
case class CC_E(a: CC_A) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(_, _)) => 1 
  case CC_F() => 2 
}
}