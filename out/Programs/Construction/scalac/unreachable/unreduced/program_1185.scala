package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: T_A[E, E], b: T_A[E, T_A[E, E]], c: E) extends T_A[E, T_A[E, E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_B(_, CC_A(_), _) => 2 
  case CC_B(_, CC_B(_, _, _), _) => 3 
}
}