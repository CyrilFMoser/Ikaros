package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: Char) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C() extends T_B
case class CC_D(a: T_A[T_B, T_A[CC_C, CC_C]], b: T_A[T_B, CC_B[CC_C]]) extends T_B
case class CC_E(a: CC_C, b: CC_D) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_C(), CC_D(_, CC_A(_, _))) => 0 
  case CC_E(CC_C(), CC_D(_, CC_B())) => 1 
}
}