package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_A[D, D], D], b: D, c: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_B[E](a: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]
case class CC_C[F](a: T_A[F, F], b: T_A[T_A[F, F], F]) extends T_B[F]
case class CC_D(a: T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]], b: CC_A[Char], c: Char) extends T_B[T_A[CC_C[Int], (Char,Byte)]]
case class CC_E(a: Boolean, b: T_B[Char], c: CC_A[T_B[(Boolean,Byte)]]) extends T_B[T_A[CC_C[Int], (Char,Byte)]]

val v_a: T_B[T_A[CC_C[Int], (Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _, _)) => 0 
  case CC_C(_, CC_B(_)) => 1 
  case CC_D(_, CC_A(_, _, _), _) => 2 
  case CC_E(_, _, _) => 3 
}
}