package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_B, b: Char) extends T_A[T_A[D, D], D]
case class CC_C(a: CC_A[CC_A[T_B]], b: T_A[T_A[T_B, T_B], T_B], c: Int) extends T_A[T_A[T_B, T_B], T_B]

val v_a: T_A[T_A[T_B, T_B], T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)