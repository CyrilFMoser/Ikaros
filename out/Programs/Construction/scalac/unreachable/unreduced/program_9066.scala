package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Int) extends T_A[C, T_A[Char, T_A[Boolean, Boolean]]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D], c: T_A[D, D]) extends T_A[D, T_A[Char, T_A[Boolean, Boolean]]]
case class CC_C[E](a: CC_B[E], b: CC_B[E]) extends T_A[E, T_A[Char, T_A[Boolean, Boolean]]]

val v_a: T_A[Int, T_A[Char, T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}