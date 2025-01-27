package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_B, T_A[T_B, T_B]], C]
case class CC_B[D](a: Byte) extends T_A[D, CC_A[D]]
case class CC_C[E](a: E, b: E, c: (CC_B[T_B],CC_B[T_B])) extends T_A[E, CC_A[E]]
case class CC_D(a: T_A[T_A[T_B, T_B], CC_A[T_A[T_B, T_B]]], b: T_A[CC_B[Byte], CC_A[CC_B[Byte]]], c: T_A[T_A[T_B, T_B], CC_A[T_A[T_B, T_B]]]) extends T_B
case class CC_E(a: T_A[CC_B[T_B], CC_A[CC_B[T_B]]], b: CC_A[T_A[T_B, T_B]], c: CC_B[Boolean]) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(CC_B(_), CC_A(_), CC_B(_)) => 1 
  case CC_F() => 2 
}
}
// This is not matched: CC_E(CC_C(CC_B(_), _, _), CC_A(_), CC_B(_))