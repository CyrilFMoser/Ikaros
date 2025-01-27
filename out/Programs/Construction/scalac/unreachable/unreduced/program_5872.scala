package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C[E](a: E, b: T_B, c: CC_B[T_A[T_B, E]]) extends T_A[T_B, E]
case class CC_D(a: T_A[Byte, T_B]) extends T_B

val v_a: T_A[T_B, CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _)), _) => 0 
  case CC_A(CC_A(_, CC_B(_)), _) => 1 
  case CC_A(CC_A(_, CC_C(_, _, _)), _) => 2 
  case CC_A(CC_B(CC_A(_, _)), _) => 3 
  case CC_A(CC_B(CC_B(_)), _) => 4 
  case CC_A(CC_B(CC_C(_, _, _)), _) => 5 
  case CC_A(CC_C(_, _, CC_B(_)), _) => 6 
  case CC_B(CC_A(_, CC_A(_, _))) => 7 
  case CC_B(CC_A(_, CC_B(_))) => 8 
  case CC_B(CC_A(_, CC_C(_, _, _))) => 9 
  case CC_B(CC_B(CC_B(_))) => 10 
  case CC_B(CC_B(CC_C(_, _, _))) => 11 
  case CC_B(CC_C(_, _, _)) => 12 
  case CC_C(_, CC_D(_), CC_B(CC_A(_, _))) => 13 
  case CC_C(_, CC_D(_), CC_B(CC_B(_))) => 14 
  case CC_C(_, CC_D(_), CC_B(CC_C(_, _, _))) => 15 
}
}
// This is not matched: CC_B(CC_B(CC_A(_, _)))