package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B(a: CC_A[T_A[Byte]], b: CC_A[T_A[(Byte,Int)]], c: CC_A[CC_A[Boolean]]) extends T_A[T_A[CC_A[Boolean]]]
case class CC_C[E](a: T_A[E], b: T_A[E]) extends T_B[E, (T_A[(Int,Char)],T_B[CC_B, CC_B])]
case class CC_D[F](a: T_B[F, F], b: CC_A[F]) extends T_B[F, (T_A[(Int,Char)],T_B[CC_B, CC_B])]
case class CC_E[G](a: CC_A[G], b: G, c: CC_A[G]) extends T_B[G, (T_A[(Int,Char)],T_B[CC_B, CC_B])]

val v_a: T_B[T_A[T_A[CC_A[Boolean]]], (T_A[(Int,Char)],T_B[CC_B, CC_B])] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_B(_, _, _)), _) => 0 
  case CC_D(_, CC_A(_)) => 1 
  case CC_E(_, _, _) => 2 
}
}
// This is not matched: CC_C(CC_A(CC_A(_)), _)