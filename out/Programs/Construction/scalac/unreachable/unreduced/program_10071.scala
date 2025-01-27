package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[T_A[Boolean, Int], Byte]]
case class CC_B[F, G](a: Boolean, b: T_B[F, F]) extends T_A[F, T_A[T_A[Boolean, Int], Byte]]
case class CC_C[H](a: T_B[H, H]) extends T_A[H, T_A[T_A[Boolean, Int], Byte]]
case class CC_D[I, J](a: (CC_A[Byte],((Byte,Boolean),Int)), b: Byte, c: T_A[J, J]) extends T_B[(CC_C[Boolean],Int), I]
case class CC_E[K](a: Int) extends T_B[(CC_C[Boolean],Int), K]
case class CC_F[L](a: CC_B[L, L], b: CC_B[L, L], c: CC_D[L, L]) extends T_B[(CC_C[Boolean],Int), L]

val v_a: T_A[Byte, T_A[T_A[Boolean, Int], Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}