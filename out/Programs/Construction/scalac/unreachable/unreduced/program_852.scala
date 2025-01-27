package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: D, c: Boolean) extends T_A[D, Byte]
case class CC_B[E](a: T_B[E]) extends T_B[E]
case class CC_C(a: CC_A[Boolean]) extends T_B[T_A[T_B[Char], Byte]]
case class CC_D[F](a: T_A[F, F], b: F, c: T_A[F, F]) extends T_B[F]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
  case CC_B(CC_D(_, _, _)) => 1 
  case CC_D(_, _, _) => 2 
}
}