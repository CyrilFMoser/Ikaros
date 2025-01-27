package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Byte, c: T_A[E, E]) extends T_A[E, T_B[T_A[Boolean, Byte], ((Boolean,Int),Int)]]
case class CC_B[F](a: CC_A[F]) extends T_A[F, T_B[T_A[Boolean, Byte], ((Boolean,Int),Int)]]
case class CC_C[G](a: CC_A[G]) extends T_A[G, T_B[T_A[Boolean, Byte], ((Boolean,Int),Int)]]
case class CC_D[H, I, J](a: (T_B[Boolean, Boolean],Int)) extends T_B[H, I]
case class CC_E[K](a: K, b: K) extends T_B[Boolean, K]
case class CC_F[L](a: CC_B[L], b: L, c: (T_B[(Boolean,Int), Byte],T_B[Boolean, Boolean])) extends T_B[(Char,Int), L]

val v_a: T_A[Char, T_B[T_A[Boolean, Byte], ((Boolean,Int),Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_C(_) => 2 
}
}