package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_A[Byte, Boolean]], b: T_B[T_B[Boolean]]) extends T_A[T_B[T_A[Int, Char]], T_A[(Int,(Int,Char)), T_A[Int, Boolean]]]
case class CC_B(a: T_B[T_A[CC_A, Char]]) extends T_A[T_B[T_A[Int, Char]], T_A[(Int,(Int,Char)), T_A[Int, Boolean]]]
case class CC_C[D](a: T_B[D], b: CC_A, c: Int) extends T_B[D]
case class CC_D[E](a: E) extends T_B[E]
case class CC_E[F]() extends T_B[F]

val v_a: T_A[T_B[T_A[Int, Char]], T_A[(Int,(Int,Char)), T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(_, _, _)) => 0 
  case CC_B(CC_D(_)) => 1 
  case CC_B(CC_E()) => 2 
}
}
// This is not matched: CC_A(_, _)