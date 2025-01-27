package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Boolean]
case class CC_B(a: T_B[T_B[CC_A, CC_A], CC_A], b: T_B[CC_A, T_A[CC_A]], c: CC_A) extends T_A[Boolean]
case class CC_C(a: T_A[T_B[CC_B, CC_B]], b: CC_A, c: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_D[D](a: CC_B, b: D) extends T_B[D, T_A[Boolean]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
}
}
// This is not matched: CC_C(_, _, _)