package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_B[Boolean], T_A[T_A[(Int,Char), Int], T_B[Boolean]]]
case class CC_B[D](a: CC_A, b: Char, c: T_A[CC_A, T_B[CC_A]]) extends T_A[D, T_B[D]]
case class CC_C[E]() extends T_A[E, T_B[E]]
case class CC_D[F, G](a: F) extends T_B[F]
case class CC_E[H](a: CC_D[H, H]) extends T_B[H]
case class CC_F(a: T_B[CC_D[CC_A, CC_A]], b: T_A[T_B[CC_A], CC_C[CC_A]], c: CC_A) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_B[T_B[T_B[T_B[CC_A]]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(CC_E(_))) => 0 
  case CC_D(CC_E(_)) => 1 
  case CC_D(CC_F(_, _, _)) => 2 
  case CC_E(CC_D(_)) => 3 
}
}
// This is not matched: CC_D(CC_D(CC_D(_)))