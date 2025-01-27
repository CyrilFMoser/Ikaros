package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E], c: T_B[E, E]) extends T_A[T_B[T_B[Boolean, Boolean], T_B[Char, Boolean]], E]
case class CC_B(a: T_B[T_A[Boolean, Int], CC_A[(Char,Boolean)]], b: T_B[(Char,Char), T_A[Int, Byte]], c: T_A[T_A[Int, Char], T_B[Boolean, Char]]) extends T_A[T_B[T_B[Boolean, Boolean], T_B[Char, Boolean]], T_A[CC_A[Char], T_B[Int, Boolean]]]
case class CC_C[F](a: CC_A[F], b: T_A[F, F]) extends T_B[F, T_A[F, F]]
case class CC_D[G](a: (T_B[CC_B, CC_B],T_A[CC_B, Char]), b: T_B[T_A[CC_C[CC_B], CC_C[CC_B]], T_A[T_A[CC_C[CC_B], CC_C[CC_B]], T_A[CC_C[CC_B], CC_C[CC_B]]]]) extends T_B[G, T_A[G, G]]
case class CC_E[I](a: (T_B[CC_B, Byte],T_B[Char, CC_B]), b: CC_A[I]) extends T_B[I, T_A[I, I]]

val v_a: T_B[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D((_,_), CC_C(_, _)) => 1 
  case CC_D((_,_), CC_E(_, _)) => 2 
  case CC_E(_, _) => 3 
}
}
// This is not matched: CC_D((_,_), CC_D(_, _))