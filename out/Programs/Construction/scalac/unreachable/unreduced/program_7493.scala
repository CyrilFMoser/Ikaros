package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[T_B[T_A[Char], (Byte,Char)]]
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A[T_B[T_A[Char], (Byte,Char)]]
case class CC_C[D](a: T_A[D], b: CC_A, c: T_A[D]) extends T_A[T_B[T_A[Char], (Byte,Char)]]
case class CC_D[E](a: CC_A, b: CC_A) extends T_B[T_B[E, E], E]
case class CC_E[F]() extends T_B[T_B[F, F], F]

val v_a: T_A[T_B[T_A[Char], (Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_), CC_A(_)) => 1 
  case CC_C(_, _, _) => 2 
}
}