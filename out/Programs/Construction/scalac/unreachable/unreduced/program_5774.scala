package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_B[D]]) extends T_A[D, T_B[D]]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, T_B[E]]

val v_a: T_A[Int, T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_))) => 1 
  case CC_A(CC_B(_)) => 2 
  case CC_B(_) => 3 
}
}