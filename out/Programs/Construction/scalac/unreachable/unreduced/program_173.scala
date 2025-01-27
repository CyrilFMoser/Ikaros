package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: D, c: D) extends T_A[T_A[T_B[Byte], Boolean], D]
case class CC_B[E](a: Char, b: T_A[E, E]) extends T_A[T_A[T_B[Byte], Boolean], E]
case class CC_C[F](a: CC_A[F]) extends T_A[T_A[T_B[Byte], Boolean], F]
case class CC_D[G]() extends T_B[G]
case class CC_E[H](a: H, b: T_A[H, Int], c: Int) extends T_B[H]
case class CC_F(a: CC_A[CC_A[(Boolean,Byte)]], b: T_B[Boolean]) extends T_B[Boolean]

val v_a: T_A[T_A[T_B[Byte], Boolean], T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_E(_, _, _), _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_, _, _)) => 2 
}
}
// This is not matched: CC_A(CC_D(), _, _)