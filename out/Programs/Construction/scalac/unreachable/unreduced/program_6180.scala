package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Char,Char), T_A[Boolean]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B[D](a: T_A[D], b: D) extends T_A[T_A[T_A[Boolean]]]
case class CC_C[F, E](a: Char, b: T_B[Char, E]) extends T_B[F, E]
case class CC_D[G](a: CC_B[T_B[Char, CC_A]], b: CC_B[G], c: T_B[G, G]) extends T_B[Char, G]
case class CC_E[H](a: (CC_C[CC_A, (Int,Int)],CC_A), b: (T_A[CC_A],CC_C[(Char,Int), CC_A]), c: H) extends T_B[Char, H]

val v_a: T_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, CC_B(_, _), CC_C(_, _)) => 1 
}
}
// This is not matched: CC_E(_, (_,CC_C(_, _)), _)