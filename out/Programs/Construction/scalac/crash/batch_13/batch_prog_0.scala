package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Boolean],Char)) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: D, c: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[E, T_A[E, E]], b: Byte, c: E) extends T_A[E, T_A[E, E]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
}
}