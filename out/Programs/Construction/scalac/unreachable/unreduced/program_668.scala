package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, Boolean]
case class CC_B[D]() extends T_A[D, Boolean]
case class CC_C[E](a: E, b: T_A[E, E]) extends T_A[E, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_)