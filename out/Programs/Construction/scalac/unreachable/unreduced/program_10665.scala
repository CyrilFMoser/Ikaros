package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_B, Boolean], C]
case class CC_B[D](a: T_A[T_A[T_B, Boolean], D], b: T_A[D, D]) extends T_A[T_A[T_B, Boolean], D]
case class CC_C[E](a: T_A[T_A[T_B, Boolean], E], b: T_A[T_A[T_B, Boolean], E]) extends T_A[T_A[T_B, Boolean], E]
case class CC_D(a: T_A[T_A[T_B, Boolean], CC_C[T_B]], b: (CC_B[T_B],T_A[T_B, T_B]), c: T_A[CC_B[Byte], Int]) extends T_B

val v_a: T_A[T_A[T_B, Boolean], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}