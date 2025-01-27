package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Int, c: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: (T_A[(Char,Boolean), Int],T_A[Boolean, Boolean]), b: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: E) extends T_A[E, T_A[T_A[E, E], T_A[T_A[E, E], T_A[E, E]]]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((_,_), _) => 1 
}
}