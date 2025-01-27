package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, T_B]
case class CC_C[E](a: T_B, b: E, c: T_A[E, E]) extends T_A[(T_A[T_B, T_B],T_A[Int, T_B]), T_B]
case class CC_D(a: T_A[CC_C[T_B], T_B], b: T_A[T_B, Boolean], c: T_A[T_A[T_B, T_B], T_B]) extends T_B
case class CC_E(a: (T_A[CC_D, T_B],T_A[(Boolean,Char), T_B]), b: CC_C[CC_B[T_B]]) extends T_B
case class CC_F(a: CC_B[CC_C[CC_E]], b: CC_A[Char], c: CC_C[Int]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), _, _) => 0 
  case CC_D(CC_B(_), _, _) => 1 
  case CC_E(_, _) => 2 
  case CC_F(CC_B(_), _, _) => 3 
}
}