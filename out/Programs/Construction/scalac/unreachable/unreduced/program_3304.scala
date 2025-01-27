package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_A[D, D]], b: T_A[T_B[D], T_B[Char]]) extends T_A[D, T_A[D, D]]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C[F]() extends T_A[F, T_A[F, F]]
case class CC_D[G](a: T_A[G, T_A[G, G]], b: Boolean, c: ((Boolean,Int),CC_A[Char])) extends T_B[G]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()