package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Char) extends T_A[D, T_B[T_A[Int, Int]]]
case class CC_B[E](a: T_A[T_A[E, E], CC_A[E]], b: CC_A[E]) extends T_A[E, T_B[T_A[Int, Int]]]

val v_a: T_A[Int, T_B[T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, 'x')) => 1 
}
}
// This is not matched: CC_B(_, CC_A(_, _))