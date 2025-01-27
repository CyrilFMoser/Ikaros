package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B, c: T_A[C, C]) extends T_A[T_A[T_A[T_B, T_B], T_B], C]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: T_B) extends T_A[T_A[T_A[T_B, T_B], T_B], D]
case class CC_C[E](a: CC_A[T_A[T_B, E]], b: (T_B,Boolean)) extends T_A[T_A[T_A[T_B, T_B], T_B], E]
case class CC_D(a: CC_C[CC_C[(Int,Boolean)]], b: T_B, c: CC_A[Int]) extends T_B
case class CC_E() extends T_B
case class CC_F(a: T_A[T_A[CC_E, T_B], CC_C[Int]], b: (T_B,(Int,CC_D))) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_E(), _) => 0 
  case CC_D(_, CC_F(_, _), _) => 1 
  case CC_E() => 2 
  case CC_F(_, _) => 3 
}
}
// This is not matched: CC_D(_, CC_D(_, _, _), _)