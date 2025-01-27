package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D](a: D, b: T_A[T_A[T_B, T_A[T_A[T_B, Boolean], T_A[T_B, Boolean]]], T_A[T_A[T_B, Boolean], T_A[T_B, Boolean]]], c: Int) extends T_A[T_A[T_B, D], D]
case class CC_C() extends T_B
case class CC_D(a: CC_A[CC_A[CC_C]]) extends T_B
case class CC_E(a: CC_C, b: T_A[T_A[T_B, CC_D], CC_D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_)) => 1 
  case CC_E(CC_C(), CC_B(CC_D(_), _, _)) => 2 
}
}