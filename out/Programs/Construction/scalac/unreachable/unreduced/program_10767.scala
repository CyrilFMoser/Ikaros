package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D]) extends T_A[T_A[T_A[Int, Boolean], Char], C]
case class CC_B[E](a: E, b: T_A[E, E], c: Byte) extends T_A[T_A[T_A[Int, Boolean], Char], E]
case class CC_C[F](a: F, b: F, c: F) extends T_A[F, T_A[CC_B[Byte], CC_A[Byte, Boolean]]]

val v_a: T_A[T_A[T_A[Int, Boolean], Char], T_A[CC_B[Byte], CC_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, _) => 2 
}
}