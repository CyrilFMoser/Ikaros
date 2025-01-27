package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: T_B) extends T_A[T_B, C]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[T_B, D]
case class CC_C[E](a: CC_A[E], b: E) extends T_A[E, CC_B[E]]

val v_a: T_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_A(CC_B(_, _), _)