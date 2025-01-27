package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, Boolean]) extends T_A[C, Boolean]
case class CC_B(a: T_A[T_A[T_B, Boolean], Boolean], b: T_A[T_A[T_B, Boolean], CC_A[Char]]) extends T_A[Char, Boolean]
case class CC_C(a: CC_A[T_A[T_B, T_B]], b: T_A[T_A[CC_B, Byte], Int]) extends T_A[Char, Boolean]
case class CC_D(a: T_A[Char, Boolean], b: CC_B) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), _) => 0 
  case CC_D(CC_C(_, _), _) => 1 
}
}
// This is not matched: CC_D(CC_B(_, _), _)