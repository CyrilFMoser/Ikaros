package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[Byte, E]) extends T_A[E, T_B[T_A[Byte, Char], T_A[Boolean, Byte]]]
case class CC_B[F](a: CC_A[F]) extends T_A[F, T_B[T_A[Byte, Char], T_A[Boolean, Byte]]]
case class CC_C[G]() extends T_A[G, T_B[T_A[Byte, Char], T_A[Boolean, Byte]]]

val v_a: T_A[Char, T_B[T_A[Byte, Char], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)