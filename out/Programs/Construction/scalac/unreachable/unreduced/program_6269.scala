package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[C, C], b: D, c: T_A[D, T_B]) extends T_A[C, T_B]
case class CC_B[E](a: T_A[E, T_B]) extends T_A[E, T_B]

val v_a: T_A[Int, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_B(CC_B(_)) => 2 
}
}