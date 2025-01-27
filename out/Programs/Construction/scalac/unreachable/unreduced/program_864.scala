package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, C]) extends T_A[Int, C]
case class CC_B[D](a: T_A[Int, D], b: T_A[Int, D]) extends T_A[(T_A[Int, (Boolean,Int)],T_A[Int, Byte]), D]
case class CC_C[E](a: T_A[Int, E]) extends T_A[Int, E]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(true, _, _) => 0 
  case CC_A(false, _, _) => 1 
  case CC_C(_) => 2 
}
}