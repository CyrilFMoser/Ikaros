package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: (Byte,T_A[Byte, Boolean]), c: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: T_A[D, D]) extends T_A[D, T_A[D, T_A[D, D]]]
case class CC_C[E](a: E) extends T_A[E, T_A[E, T_A[E, E]]]

val v_a: T_A[Byte, T_A[Byte, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _) => 0 
  case CC_C(_) => 1 
}
}