package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: D, c: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: E, b: CC_A[E]) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: (Char,T_B[(Boolean,Int)]), b: T_A[F, T_A[F, F]]) extends T_B[F]
case class CC_D[G](a: CC_B[G]) extends T_B[G]
case class CC_E[H](a: Boolean, b: H) extends T_B[H]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _, _)) => 0 
  case CC_C(_, CC_B(_, _)) => 1 
  case CC_D(CC_B(_, _)) => 2 
}
}
// This is not matched: CC_E(_, _)