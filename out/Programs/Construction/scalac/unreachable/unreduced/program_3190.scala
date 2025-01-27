package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, Char]) extends T_A[E, T_A[T_A[Boolean, Char], T_B[Int, Byte]]]
case class CC_B[F](a: T_B[F, F], b: T_B[F, F]) extends T_A[T_B[T_B[Byte, Byte], Byte], F]
case class CC_C(a: Byte) extends T_A[Boolean, T_A[T_A[Boolean, Char], T_B[Int, Byte]]]
case class CC_D[G](a: Boolean, b: T_A[G, G]) extends T_B[G, Byte]
case class CC_E[H](a: ((Char,CC_C),CC_D[CC_C]), b: CC_B[H], c: H) extends T_B[(T_B[CC_C, Byte],(CC_C,Boolean)), H]

val v_a: T_A[Boolean, T_A[T_A[Boolean, Char], T_B[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}