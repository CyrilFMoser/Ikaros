package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: Byte) extends T_A[E, T_A[E, E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_)) => 3 
  case CC_A(CC_C(_)) => 4 
  case CC_B(_) => 5 
  case CC_C(_) => 6 
}
}