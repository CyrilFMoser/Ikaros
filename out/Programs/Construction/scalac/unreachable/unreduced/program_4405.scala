package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: (T_A[Boolean, Char],Char), b: T_B[E, E], c: (Int,T_B[Char, Char])) extends T_A[Boolean, E]
case class CC_B[G](a: T_A[G, G]) extends T_A[Boolean, G]
case class CC_C[H](a: (T_A[Boolean, Int],CC_A[Char, Int])) extends T_B[H, CC_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]]]
case class CC_D[I](a: CC_B[I], b: T_B[I, I]) extends T_B[I, CC_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]]]
case class CC_E[J]() extends T_B[J, CC_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]]]

val v_a: T_B[Byte, CC_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C((CC_A(_, _, _),CC_A(_, _, _))) => 0 
  case CC_D(CC_B(_), _) => 1 
  case CC_E() => 2 
}
}
// This is not matched: CC_C((CC_B(_),CC_A(_, _, _)))