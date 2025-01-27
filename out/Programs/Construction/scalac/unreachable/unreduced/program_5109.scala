package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, C], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Byte) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[E, E], b: E, c: Boolean) extends T_A[E, T_A[E, E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_)) => 1 
  case CC_A(_, _, CC_C(_, _, _)) => 2 
  case CC_B(_) => 3 
  case CC_C(_, _, true) => 4 
  case CC_C(_, _, false) => 5 
}
}