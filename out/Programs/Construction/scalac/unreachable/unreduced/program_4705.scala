package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[Char, T_A[Int, Boolean]]]
case class CC_B[D](a: D, b: D, c: Boolean) extends T_A[D, T_A[Char, T_A[Int, Boolean]]]
case class CC_C[E](a: CC_B[E], b: (CC_B[Int],CC_A[Boolean]), c: T_A[E, E]) extends T_A[E, T_A[Char, T_A[Int, Boolean]]]

val v_a: T_A[Int, T_A[Char, T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, 12, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(CC_B(_, _, _), (CC_B(_, _, _),CC_A(_)), _) => 3 
}
}