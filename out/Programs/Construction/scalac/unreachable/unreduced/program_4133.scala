package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Byte) extends T_A[C, T_B]
case class CC_B[D](a: (Byte,T_A[T_B, T_B]), b: CC_A[Byte]) extends T_A[D, T_B]
case class CC_C[E](a: E, b: T_A[CC_B[E], T_B], c: T_A[E, E]) extends T_A[E, T_B]
case class CC_D(a: T_A[CC_B[T_B], T_B], b: CC_A[CC_B[T_B]], c: Boolean) extends T_B
case class CC_E(a: CC_A[Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_), CC_A(_), _) => 0 
  case CC_D(CC_C(_, _, _), CC_A(_), _) => 1 
  case CC_E(CC_A(_)) => 2 
}
}
// This is not matched: CC_D(CC_B(_, _), CC_A(_), _)