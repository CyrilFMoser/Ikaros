package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: C) extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B[D](a: T_A[D, D], b: CC_A[D], c: T_A[D, D]) extends T_A[D, T_A[D, T_A[D, D]]]

val v_a: T_A[Char, T_A[Char, T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(true, _) => 0 
  case CC_A(false, _) => 1 
  case CC_B(_, _, _) => 2 
}
}