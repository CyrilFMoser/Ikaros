package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: Boolean) extends T_A[T_A[C, C], C]
case class CC_B(a: CC_A[CC_A[T_B, Char], Boolean], b: T_A[CC_A[Byte, T_B], T_B]) extends T_A[T_B, T_A[T_A[T_B, Boolean], Boolean]]
case class CC_C(a: T_A[T_A[Byte, Byte], Byte], b: T_A[CC_A[CC_B, T_B], CC_B], c: CC_A[CC_A[CC_B, CC_B], CC_A[T_B, CC_B]]) extends T_B
case class CC_D(a: CC_A[T_B, T_A[CC_C, CC_C]], b: Boolean, c: CC_B) extends T_B
case class CC_E(a: CC_B, b: T_A[T_A[T_B, T_B], CC_C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_)) => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_E(CC_B(_, _), _)