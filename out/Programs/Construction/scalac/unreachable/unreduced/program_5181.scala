package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_A[T_A[T_A[Byte, (Byte,Int)], T_A[Byte, (Byte,Int)]], T_B[T_A[T_A[Byte, (Byte,Int)], T_A[Byte, (Byte,Int)]], T_A[T_A[Byte, (Byte,Int)], T_A[Byte, (Byte,Int)]]]], b: F) extends T_A[F, T_B[F, F]]
case class CC_C[H](a: T_A[H, T_B[H, H]], b: H) extends T_A[H, T_B[H, H]]
case class CC_D[I, J]() extends T_B[I, J]
case class CC_E[K, L]() extends T_B[L, K]
case class CC_F[M](a: CC_C[M]) extends T_B[T_A[M, M], M]

val v_a: T_A[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_B(CC_B(CC_A(), _), _) => 2 
  case CC_B(CC_B(CC_B(_, _), _), _) => 3 
  case CC_B(CC_B(CC_C(_, _), _), _) => 4 
  case CC_B(CC_C(_, _), _) => 5 
  case CC_C(_, _) => 6 
}
}