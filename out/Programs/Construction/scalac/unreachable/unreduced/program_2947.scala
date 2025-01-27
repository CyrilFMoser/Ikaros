package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[C, T_A[C, C]]) extends T_A[T_B, C]
case class CC_B(a: T_B) extends T_B
case class CC_C(a: T_A[T_B, T_B], b: T_A[T_B, CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_C(_, _))) => 0 
  case CC_B(CC_C(_, _)) => 1 
  case CC_C(CC_A(CC_A(_)), CC_A(_)) => 2 
}
}
// This is not matched: CC_B(CC_B(CC_B(_)))