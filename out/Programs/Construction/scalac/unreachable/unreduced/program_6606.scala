package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean) extends T_A[Boolean]
case class CC_B() extends T_A[Boolean]
case class CC_C(a: T_A[T_A[CC_A]], b: CC_A, c: Byte) extends T_A[Boolean]
case class CC_D() extends T_B
case class CC_E(a: T_A[CC_B], b: CC_A, c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _, CC_A(true)) => 1 
  case CC_E(_, _, CC_A(false)) => 2 
}
}