package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[T_A[T_B, Boolean], T_B], C]
case class CC_B[D](a: (T_B,T_B)) extends T_A[T_A[T_A[T_B, Boolean], T_B], D]
case class CC_C[E](a: E) extends T_A[T_A[T_A[T_B, Boolean], T_B], E]

val v_a: T_A[T_A[T_A[T_B, Boolean], T_B], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_)