package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int) extends T_A[D]
case class CC_B(a: T_A[Char]) extends T_A[T_A[T_A[Char]]]
case class CC_C[E](a: Int) extends T_B[T_A[E], E]
case class CC_D[G, F](a: T_B[F, F], b: T_B[F, F], c: Int) extends T_B[F, G]
case class CC_E[H](a: H, b: Int) extends T_B[H, Char]

val v_a: T_B[T_A[Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_D(_, CC_D(_, _, _), _), CC_D(_, _, _), _) => 1 
}
}