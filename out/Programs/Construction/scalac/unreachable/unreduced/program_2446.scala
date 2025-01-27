package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E], c: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B() extends T_A[T_A[Char, (Int,Int)], T_A[T_A[Char, (Int,Int)], T_A[Char, (Int,Int)]]]
case class CC_C[F](a: F, b: F) extends T_A[F, T_A[F, F]]
case class CC_D[H, G](a: CC_A[H]) extends T_B[H, G]
case class CC_E[I](a: I, b: I) extends T_B[T_B[CC_A[I], I], I]

val v_a: T_A[T_A[Char, (Int,Int)], T_A[T_A[Char, (Int,Int)], T_A[Char, (Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(CC_A(_, _, _)), _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}