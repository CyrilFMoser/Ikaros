package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[C, T_A[(Boolean,Int), C]]]
case class CC_B[D]() extends T_A[D, T_A[D, T_A[(Boolean,Int), D]]]
case class CC_C[E, F](a: CC_B[F], b: E, c: CC_A[E]) extends T_A[E, T_A[E, T_A[(Boolean,Int), E]]]

val v_a: T_A[Int, T_A[Int, T_A[(Boolean,Int), Int]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, CC_A(_, _)) => 1 
}
}
// This is not matched: CC_A(_, _)