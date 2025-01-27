package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_B[E, E], E], b: T_B[E, E]) extends T_A[T_A[T_B[Boolean, Int], T_B[Byte, Byte]], E]
case class CC_B[F](a: F, b: CC_A[F]) extends T_A[F, CC_A[F]]
case class CC_C[G](a: Char, b: T_B[G, G]) extends T_A[G, Char]
case class CC_D[I, H](a: CC_C[I], b: H) extends T_B[H, I]
case class CC_E[J, K](a: (Byte,Byte)) extends T_B[K, J]
case class CC_F[M, L]() extends T_B[M, L]

val v_a: T_A[T_A[T_B[Boolean, Int], T_B[Byte, Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _), CC_D(CC_C(_, _), _)) => 0 
  case CC_A(CC_C(_, _), CC_E((_,_))) => 1 
  case CC_A(CC_C(_, _), CC_F()) => 2 
  case CC_C(_, CC_D(_, _)) => 3 
  case CC_C(_, CC_E((_,_))) => 4 
  case CC_C(_, CC_F()) => 5 
}
}