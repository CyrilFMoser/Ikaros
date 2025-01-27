package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[T_A[Char, Byte], T_B[Char, Boolean]], E]
case class CC_B[F]() extends T_A[F, T_A[F, F]]
case class CC_C[G](a: (T_A[Byte, Int],Char)) extends T_A[G, T_A[G, G]]
case class CC_D[I, H, J](a: I, b: I) extends T_B[H, I]
case class CC_E[L, K]() extends T_B[K, L]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((_,_)) => 1 
}
}