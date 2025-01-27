package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, T_A[T_A[Char, Byte], T_A[Char, Boolean]]]
case class CC_B[E](a: E, b: E) extends T_A[E, T_A[T_A[Char, Byte], T_A[Char, Boolean]]]
case class CC_C[F](a: T_A[F, F]) extends T_A[F, T_A[T_A[Char, Byte], T_A[Char, Boolean]]]

val v_a: T_A[Int, T_A[T_A[Char, Byte], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _)