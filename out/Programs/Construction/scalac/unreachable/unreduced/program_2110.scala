package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: CC_A[D], b: T_A[D, T_A[D, D]], c: (((Int,Int),Int),T_A[Boolean, Boolean])) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _, ((_,_),_))