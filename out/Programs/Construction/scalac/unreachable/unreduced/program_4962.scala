package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D], c: T_A[D, D]) extends T_A[D, T_A[T_B[Byte], T_A[Boolean, Boolean]]]
case class CC_B[E](a: Byte) extends T_A[E, T_A[T_B[Byte], T_A[Boolean, Boolean]]]
case class CC_C[F](a: T_B[F]) extends T_A[F, T_A[T_B[Byte], T_A[Boolean, Boolean]]]

val v_a: T_A[Char, T_A[T_B[Byte], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_)