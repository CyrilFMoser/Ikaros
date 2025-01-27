package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_B[T_B[Byte]]]
case class CC_B[E](a: T_A[CC_A[E], E]) extends T_A[E, T_B[T_B[Byte]]]
case class CC_C(a: T_B[CC_B[Char]]) extends T_A[T_A[(Boolean,Byte), CC_B[Char]], T_B[T_B[Byte]]]
case class CC_D[F]() extends T_B[F]
case class CC_E[G](a: CC_A[G], b: T_B[G]) extends T_B[G]
case class CC_F[H](a: T_B[T_B[H]], b: T_A[H, H]) extends T_B[H]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_D()) => 0 
  case CC_C(CC_E(_, _)) => 1 
  case CC_C(CC_F(_, _)) => 2 
}
}