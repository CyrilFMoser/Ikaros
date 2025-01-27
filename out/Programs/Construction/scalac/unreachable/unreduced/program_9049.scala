package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, C], c: C) extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B[D](a: T_A[D, CC_A[D]]) extends T_A[D, T_A[T_A[D, D], D]]
case class CC_C[E](a: Byte) extends T_A[E, T_A[T_A[E, E], E]]

val v_a: T_A[Int, T_A[T_A[Int, Int], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(0) => 2 
  case CC_C(_) => 3 
}
}