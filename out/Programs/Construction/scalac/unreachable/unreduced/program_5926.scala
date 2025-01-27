package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[T_B, Char], c: T_B) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C(a: T_B, b: Int) extends T_B
case class CC_D(a: T_A[T_B, Boolean], b: T_A[T_B, Int], c: T_A[CC_A[T_B], T_A[T_B, CC_C]]) extends T_B
case class CC_E[E]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_, _), _), _) => 0 
  case CC_C(CC_C(CC_D(_, _, _), _), _) => 1 
  case CC_C(CC_C(CC_E(), _), _) => 2 
  case CC_C(CC_D(_, _, _), _) => 3 
  case CC_D(_, _, _) => 4 
  case CC_E() => 5 
}
}
// This is not matched: CC_C(CC_E(), _)