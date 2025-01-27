package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[T_A[C]], b: Byte, c: T_A[C]) extends T_A[T_B[T_B[Byte]]]
case class CC_B(a: CC_A[CC_A[Int]], b: CC_A[T_A[Boolean]], c: T_B[Boolean]) extends T_A[T_B[T_B[Byte]]]
case class CC_C(a: T_A[(CC_B,CC_B)]) extends T_A[T_B[T_B[Byte]]]
case class CC_D[D](a: D, b: CC_B, c: T_A[D]) extends T_B[D]
case class CC_E[E](a: E, b: CC_A[E], c: T_A[E]) extends T_B[E]
case class CC_F[F, G](a: T_A[F], b: F) extends T_B[F]

val v_a: T_A[T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_)