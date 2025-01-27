package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Char, T_A[T_B, T_B]], b: Char, c: T_B) extends T_A[T_B, T_B]
case class CC_B(a: T_A[T_B, T_B], b: T_B, c: T_B) extends T_A[T_B, T_B]
case class CC_C(a: T_A[T_B, T_B], b: CC_A) extends T_B
case class CC_D(a: T_A[T_B, T_B]) extends T_B
case class CC_E(a: CC_D, b: Char, c: CC_A) extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), CC_C(_, _), _) => 1 
  case CC_B(CC_B(_, _, _), CC_C(_, _), _) => 2 
  case CC_B(CC_B(_, _, _), CC_D(_), _) => 3 
  case CC_B(CC_A(_, _, _), CC_E(_, _, _), _) => 4 
  case CC_B(CC_B(_, _, _), CC_E(_, _, _), _) => 5 
}
}
// This is not matched: CC_B(CC_A(_, _, _), CC_D(_), _)