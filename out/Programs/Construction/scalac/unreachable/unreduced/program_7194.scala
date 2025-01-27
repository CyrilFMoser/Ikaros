package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: E, c: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_B[F, G](a: T_A[G, T_A[G, G]], b: T_A[G, T_A[G, G]]) extends T_A[F, T_A[F, F]]
case class CC_C[H](a: (CC_B[Byte, Char],T_A[Boolean, Byte])) extends T_B[H, T_A[T_B[Byte, Int], T_A[T_B[Byte, Int], T_B[Byte, Int]]]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_, _))) => 1 
  case CC_A(_, _, CC_B(_, _)) => 2 
  case CC_B(_, _) => 3 
}
}