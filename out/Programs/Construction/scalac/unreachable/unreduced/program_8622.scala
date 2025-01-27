package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B[D](a: Boolean, b: Byte, c: D) extends T_A[D, T_A[T_A[T_B, T_B], ((Int,Char),T_B)]]
case class CC_C(a: Boolean, b: T_A[T_B, CC_A[T_B]]) extends T_B
case class CC_D(a: T_A[CC_A[CC_C], CC_B[CC_C]]) extends T_B
case class CC_E(a: CC_A[(Boolean,CC_C)], b: CC_B[T_A[CC_C, CC_C]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_A(), _) => 1 
}
}
// This is not matched: CC_C(_, _)