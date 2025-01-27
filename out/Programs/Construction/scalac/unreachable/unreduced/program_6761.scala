package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[T_A[C, C], T_A[C, C]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[D, D], T_A[D, D]]]
case class CC_C[E](a: Int) extends T_A[E, T_A[T_A[E, E], T_A[E, E]]]

val v_a: T_A[Int, T_A[T_A[Int, Int], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_)