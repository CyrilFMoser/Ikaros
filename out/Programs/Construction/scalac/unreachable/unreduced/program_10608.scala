package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: Char, c: Boolean) extends T_A[Int, D]
case class CC_B[E](a: T_A[Int, E], b: T_A[Int, E]) extends T_A[Int, T_A[Int, (Boolean,Int)]]
case class CC_C[F](a: CC_B[(Boolean,Boolean)]) extends T_A[Int, F]
case class CC_D[G]() extends T_B[G]
case class CC_E[H](a: CC_D[H], b: CC_A[T_B[H]]) extends T_B[H]
case class CC_F[I](a: Byte) extends T_B[I]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, true), _) => 0 
  case CC_B(CC_A(_, _, false), _) => 1 
  case CC_B(CC_C(CC_B(_, _)), _) => 2 
}
}