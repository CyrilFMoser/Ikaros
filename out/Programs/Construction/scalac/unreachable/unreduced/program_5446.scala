package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_B), b: (Char,Int)) extends T_A[T_A[T_A[Char, T_B], T_B], C]
case class CC_B[D](a: Int) extends T_A[T_A[T_A[Char, T_B], T_B], D]
case class CC_C[E](a: T_A[T_B, E], b: T_A[E, E]) extends T_A[T_A[T_A[Char, T_B], T_B], E]
case class CC_D() extends T_B
case class CC_E[F](a: F, b: F) extends T_B
case class CC_F(a: CC_C[CC_B[Boolean]], b: CC_E[CC_D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _) => 1 
  case CC_F(CC_C(_, _), CC_E(CC_D(), _)) => 2 
}
}