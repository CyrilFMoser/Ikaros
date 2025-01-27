package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Boolean, T_A[Boolean]]) extends T_A[(T_B[Byte, Int],Char)]
case class CC_B[D, E](a: T_A[D], b: E, c: T_B[E, E]) extends T_B[D, E]
case class CC_C[F](a: T_A[F], b: CC_B[F, T_B[F, F]], c: F) extends T_B[T_B[CC_B[F, F], F], F]
case class CC_D[H, G](a: T_B[G, G], b: H) extends T_B[G, H]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(CC_B(_, _, _)), _) => 0 
  case CC_B(_, CC_A(CC_D(_, _)), _) => 1 
  case CC_D(CC_B(_, CC_A(_), _), _) => 2 
  case CC_D(CC_D(_, CC_A(_)), _) => 3 
}
}