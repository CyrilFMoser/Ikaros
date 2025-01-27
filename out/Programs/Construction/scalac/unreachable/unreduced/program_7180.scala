package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: T_A[D, D]) extends T_A[D, T_A[T_A[Boolean, Char], T_B[Byte]]]
case class CC_B[E]() extends T_A[E, T_A[T_A[Boolean, Char], T_B[Byte]]]
case class CC_C[F](a: Int, b: CC_A[F]) extends T_A[F, T_A[T_A[Boolean, Char], T_B[Byte]]]

val v_a: T_A[Char, T_A[T_A[Boolean, Char], T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _)