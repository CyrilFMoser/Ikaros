package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_B, C]
case class CC_B(a: T_B, b: T_A[T_B, T_B], c: T_A[T_B, Char]) extends T_A[T_B, Char]
case class CC_C() extends T_B

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_C(), _, CC_B(_, CC_A(_, _), CC_A(_, _))) => 1 
  case CC_B(CC_C(), _, CC_B(_, CC_A(_, _), CC_B(_, _, _))) => 2 
}
}
// This is not matched: CC_B(CC_C(), _, CC_A(_, _))