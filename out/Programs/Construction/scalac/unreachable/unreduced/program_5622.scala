package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D], b: Char) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}