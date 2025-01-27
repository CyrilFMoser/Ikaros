package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: Boolean) extends T_A[T_A[Boolean]]
case class CC_B(a: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_C() extends T_A[T_A[Boolean]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, true)) => 0 
  case CC_B(CC_A(_, false)) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(CC_C()) => 3 
}
}