package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]], c: T_A[C, C]) extends T_A[T_A[Int, T_A[Int, Byte]], C]
case class CC_B[D](a: CC_A[D], b: D) extends T_A[T_A[Int, T_A[Int, Byte]], D]
case class CC_C[E](a: E, b: CC_B[E]) extends T_A[T_A[Int, T_A[Int, Byte]], E]

val v_a: T_A[T_A[Int, T_A[Int, Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_C(_, CC_B(_, _)) => 2 
}
}