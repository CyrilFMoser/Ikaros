package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: T_A[D, T_A[D, D]], c: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[E, E], b: T_A[(Int,Int), T_A[(Int,Int), (Int,Int)]]) extends T_A[E, T_A[CC_A[Int], Int]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}