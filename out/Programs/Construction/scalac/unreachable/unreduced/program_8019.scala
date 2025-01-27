package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Int, c: Int) extends T_A[D, T_B[(Char,Char)]]
case class CC_B[E](a: CC_A[E]) extends T_B[E]
case class CC_C[F](a: T_A[F, F], b: F, c: F) extends T_B[F]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_C(_, _, _) => 1 
}
}