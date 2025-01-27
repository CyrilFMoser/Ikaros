package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: Char) extends T_A[E, T_B[T_A[Byte, Boolean], T_A[Boolean, Int]]]
case class CC_B[F](a: T_B[F, F], b: T_B[F, F], c: F) extends T_A[F, T_B[T_A[Byte, Boolean], T_A[Boolean, Int]]]
case class CC_C[G, H](a: CC_B[G], b: T_B[H, H], c: T_B[T_A[H, G], G]) extends T_B[G, H]

val v_a: T_A[Char, T_B[T_A[Byte, Boolean], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_C(_, CC_C(_, _, _), _), CC_C(_, _, _), _) => 1 
}
}