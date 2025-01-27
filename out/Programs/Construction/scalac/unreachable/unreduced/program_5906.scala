package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char, b: T_B, c: C) extends T_A[C, T_A[Char, T_B]]
case class CC_B[D](a: T_A[D, D], b: CC_A[D]) extends T_A[D, T_A[Char, T_B]]
case class CC_C[E](a: E, b: CC_A[E], c: Char) extends T_A[E, T_A[Char, T_B]]
case class CC_D(a: ((T_B,Boolean),CC_C[Char])) extends T_B

val v_a: T_A[Boolean, T_A[Char, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D((_,_)), true) => 0 
  case CC_A(_, CC_D((_,_)), false) => 1 
  case CC_B(_, _) => 2 
  case CC_C(_, CC_A(_, _, _), _) => 3 
}
}