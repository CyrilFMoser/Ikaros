package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Char, c: T_A[T_B[E, E], E]) extends T_A[T_B[E, E], E]
case class CC_B[F](a: T_A[T_B[F, F], F], b: F, c: T_A[T_B[F, F], F]) extends T_A[T_B[F, F], F]
case class CC_C[G](a: G, b: CC_B[G]) extends T_B[G, T_A[CC_B[Int], CC_B[Boolean]]]
case class CC_D[H, I](a: CC_A[I]) extends T_B[H, I]
case class CC_E(a: CC_B[CC_C[Boolean]], b: Boolean) extends T_B[((Byte,Char),(Int,Int)), T_A[CC_B[Int], CC_B[Boolean]]]

val v_a: T_B[Char, T_A[CC_B[Int], CC_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A(CC_C(_, _), _, CC_A(_, _, _))) => 1 
  case CC_D(CC_A(CC_C(_, _), _, CC_B(_, _, _))) => 2 
  case CC_D(CC_A(CC_D(_), _, CC_B(_, _, _))) => 3 
}
}
// This is not matched: CC_D(CC_A(CC_D(_), _, CC_A(_, _, _)))