package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: T_A[D, D]) extends T_A[T_A[D, T_A[D, D]], D]
case class CC_B[E](a: Boolean) extends T_A[T_A[E, T_A[E, E]], E]

val v_a: T_A[T_A[Int, T_A[Int, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}