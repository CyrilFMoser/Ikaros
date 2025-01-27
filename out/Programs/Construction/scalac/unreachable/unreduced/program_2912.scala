package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: (T_A[Char, Char],T_A[Byte, Int]), c: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_B[E](a: CC_A[E], b: T_A[T_A[E, E], E], c: E) extends T_A[T_A[E, E], E]
case class CC_C[F](a: CC_A[F], b: F) extends T_B[F]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _), (_,_), _) => 0 
  case CC_B(_, _, _) => 1 
}
}