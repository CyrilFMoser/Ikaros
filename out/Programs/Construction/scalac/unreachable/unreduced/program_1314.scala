package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, D], c: Byte) extends T_A[D]
case class CC_B[E](a: T_A[E], b: CC_A[E]) extends T_A[E]
case class CC_C[F](a: T_B[F, F]) extends T_A[F]
case class CC_D[G]() extends T_B[G, CC_C[G]]
case class CC_E(a: T_B[CC_D[Char], CC_C[CC_D[Char]]]) extends T_B[T_A[CC_B[Byte]], CC_C[T_A[CC_B[Byte]]]]
case class CC_F[H](a: CC_D[H], b: CC_B[H], c: T_B[H, CC_C[H]]) extends T_B[H, CC_C[H]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(CC_C(_), _) => 3 
  case CC_C(_) => 4 
}
}