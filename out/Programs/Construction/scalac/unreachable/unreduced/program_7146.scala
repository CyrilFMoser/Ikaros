package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, T_B]], C]
case class CC_B[D](a: D, b: CC_A[D], c: Boolean) extends T_A[T_A[T_A[T_B, T_B], T_A[T_B, T_B]], D]
case class CC_C(a: CC_B[CC_B[T_B]], b: CC_B[Byte]) extends T_B
case class CC_D(a: CC_A[CC_C], b: CC_C, c: T_A[CC_C, CC_C]) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_C(CC_B(_, CC_A(_), _), CC_B(_, CC_A(_), _))