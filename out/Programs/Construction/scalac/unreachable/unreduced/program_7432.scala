package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]]) extends T_A[(T_A[T_B],T_B)]
case class CC_B[B]() extends T_A[(T_A[T_B],T_B)]
case class CC_C(a: CC_B[CC_B[T_B]]) extends T_A[(T_A[T_B],T_B)]
case class CC_D(a: Char) extends T_B
case class CC_E(a: CC_D, b: CC_B[T_A[CC_A]]) extends T_B
case class CC_F(a: CC_C) extends T_B

val v_a: T_A[(T_A[T_B],T_B)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}