package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_A[Boolean, Boolean], Int], b: T_A[T_A[Byte, (Int,Char)], Boolean]) extends T_A[T_A[T_A[Int, Boolean], T_B[Byte, Boolean]], Byte]
case class CC_B(a: T_B[CC_A, Boolean]) extends T_A[T_A[T_A[Int, Boolean], T_B[Byte, Boolean]], Byte]
case class CC_C(a: CC_B, b: T_B[CC_A, (CC_B,Boolean)]) extends T_A[T_A[T_A[Int, Boolean], T_B[Byte, Boolean]], Byte]
case class CC_D[F, E](a: CC_B, b: T_B[F, F], c: T_A[E, F]) extends T_B[F, E]
case class CC_E[G, H](a: T_B[H, H], b: CC_C, c: T_B[H, H]) extends T_B[G, T_B[G, G]]
case class CC_F[I](a: CC_A, b: (T_B[CC_B, Char],CC_C), c: T_B[I, I]) extends T_B[I, T_B[I, I]]

val v_a: T_B[CC_B, T_B[CC_B, CC_B]] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(CC_D(_, _, _)), CC_D(CC_B(_), CC_D(_, _, _), _), _) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F(_, _, _) => 2 
}
}