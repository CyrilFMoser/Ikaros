package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int) extends T_A[T_A[T_B, T_B], C]
case class CC_B[D](a: T_A[T_A[T_B, T_B], D], b: Byte) extends T_A[T_A[T_B, T_B], D]
case class CC_C(a: T_A[T_A[T_B, T_B], CC_A[T_B]], b: CC_A[CC_A[T_B]], c: T_B) extends T_A[T_A[T_B, T_B], Char]
case class CC_D(a: T_B) extends T_B
case class CC_E(a: Byte, b: Char, c: T_A[CC_A[CC_C], CC_B[T_B]]) extends T_B

val v_a: T_A[T_A[T_B, T_B], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_B(CC_C(_, _, _), _) => 2 
  case CC_C(CC_A(_), CC_A(_), CC_D(CC_D(_))) => 3 
  case CC_C(CC_A(_), CC_A(_), CC_D(CC_E(_, _, _))) => 4 
  case CC_C(CC_A(_), CC_A(_), CC_E(_, _, _)) => 5 
  case CC_C(CC_B(_, _), CC_A(_), CC_D(CC_D(_))) => 6 
  case CC_C(CC_B(_, _), CC_A(_), CC_D(CC_E(_, _, _))) => 7 
  case CC_C(CC_B(_, _), CC_A(_), CC_E(_, _, _)) => 8 
}
}
// This is not matched: CC_B(CC_B(_, _), _)