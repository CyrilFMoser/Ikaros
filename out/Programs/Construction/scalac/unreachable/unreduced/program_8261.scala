package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: C) extends T_A[Boolean]
case class CC_B(a: CC_A[T_A[Char]], b: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_C[D](a: T_A[Boolean], b: T_B[D]) extends T_B[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}