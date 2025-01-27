package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[T_B, C]
case class CC_B(a: T_A[T_A[T_B, T_B], Byte], b: T_A[T_B, T_A[T_B, Boolean]]) extends T_A[T_B, Boolean]
case class CC_C(a: Int) extends T_A[T_B, Boolean]
case class CC_D() extends T_B
case class CC_E(a: T_A[T_B, Boolean], b: CC_B, c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(_), CC_B(_, CC_A(_)), CC_C(_)) => 1 
  case CC_E(CC_B(_, _), CC_B(_, CC_A(_)), CC_C(_)) => 2 
}
}
// This is not matched: CC_E(CC_C(_), CC_B(_, CC_A(_)), CC_C(_))