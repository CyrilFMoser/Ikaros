package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, Boolean]], c: C) extends T_A[C, Boolean]
case class CC_B[D](a: T_A[D, Boolean], b: CC_A[D], c: CC_A[D]) extends T_A[D, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}