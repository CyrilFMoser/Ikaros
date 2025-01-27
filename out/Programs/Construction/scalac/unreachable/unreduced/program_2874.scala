package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: Int, c: T_A[C, C]) extends T_A[C, T_A[C, T_A[C, Char]]]
case class CC_B[D](a: T_A[D, D], b: (CC_A[Boolean],Boolean), c: T_A[D, D]) extends T_A[D, T_A[D, T_A[D, Char]]]
case class CC_C[E](a: Char, b: CC_B[T_A[E, E]]) extends T_A[E, T_A[E, T_A[E, Char]]]

val v_a: T_A[Boolean, T_A[Boolean, T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, (CC_A(_, _, _),true), _) => 1 
  case CC_B(_, (CC_A(_, _, _),false), _) => 2 
  case CC_C(_, _) => 3 
}
}