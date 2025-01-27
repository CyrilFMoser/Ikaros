package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: Int) extends T_A[D, T_A[T_A[Byte, Boolean], (Char,(Int,Int))]]
case class CC_B[E](a: T_A[E, E], b: T_B[E]) extends T_B[E]
case class CC_C[F](a: T_B[F]) extends T_B[F]
case class CC_D[G](a: Boolean, b: Int, c: CC_A[G]) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _, CC_A(_, 12)) => 1 
  case CC_D(_, _, CC_A(_, _)) => 2 
}
}
// This is not matched: CC_B(_, _)