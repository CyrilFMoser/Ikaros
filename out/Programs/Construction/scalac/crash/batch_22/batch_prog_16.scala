package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: CC_A[D], b: D) extends T_A[D, T_A[D, D]]
case class CC_C[E, F](a: T_A[F, Char], b: Boolean, c: CC_A[F]) extends T_A[E, F]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
}
}