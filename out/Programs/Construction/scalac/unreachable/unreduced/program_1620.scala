package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: Boolean) extends T_A[T_A[Boolean]]
case class CC_B() extends T_A[T_A[Boolean]]
case class CC_C(a: T_A[T_A[Boolean]]) extends T_A[T_A[(T_B,CC_B)]]
case class CC_D() extends T_B
case class CC_E(a: T_A[CC_C]) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_) => 1 
  case CC_F() => 2 
}
}