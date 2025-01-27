package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, Boolean]
case class CC_B[D](a: CC_A[D], b: T_A[D, T_A[D, Boolean]]) extends T_A[D, Boolean]
case class CC_C[E](a: Byte) extends T_A[E, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_)