package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], Int], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[Char, T_A[Boolean, Int]]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[D, CC_A[CC_A[D]]]
case class CC_C[E](a: CC_B[E], b: E, c: Boolean) extends T_A[E, T_A[Char, T_A[Boolean, Int]]]

val v_a: T_A[Int, T_A[Char, T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}