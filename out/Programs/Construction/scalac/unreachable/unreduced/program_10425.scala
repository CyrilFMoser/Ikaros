package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[Int, C]], b: T_A[C, C], c: T_A[C, C]) extends T_A[Int, C]
case class CC_B[D](a: CC_A[(Boolean,Int)], b: T_A[Int, D]) extends T_A[Int, D]
case class CC_C[E](a: T_A[Int, E], b: T_A[Int, E], c: E) extends T_A[Int, E]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_C(_, _, _) => 2 
}
}