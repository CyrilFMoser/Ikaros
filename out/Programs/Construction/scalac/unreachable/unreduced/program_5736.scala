package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D](a: D) extends T_A[T_B, D]
case class CC_C[E](a: Char) extends T_B
case class CC_D(a: T_A[T_B, T_A[T_B, T_B]]) extends T_B
case class CC_E(a: CC_C[CC_B[T_B]], b: CC_B[Char], c: T_A[T_B, CC_B[CC_D]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_B(CC_A(_))) => 1 
  case CC_D(CC_B(CC_B(_))) => 2 
  case CC_E(CC_C('x'), CC_B(_), CC_A(_)) => 3 
  case CC_E(CC_C(_), CC_B(_), CC_A(_)) => 4 
  case CC_E(CC_C('x'), CC_B(_), CC_B(_)) => 5 
  case CC_E(CC_C(_), CC_B(_), CC_B(_)) => 6 
}
}
// This is not matched: CC_D(CC_A(_))