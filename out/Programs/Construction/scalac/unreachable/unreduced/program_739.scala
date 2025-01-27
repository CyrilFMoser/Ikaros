package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: Byte, c: T_A[D]) extends T_A[T_B[T_A[Char], T_B[Char, Char]]]
case class CC_B(a: T_A[T_B[Byte, Byte]]) extends T_A[T_B[T_A[Char], T_B[Char, Char]]]
case class CC_C[F, E](a: F, b: T_B[E, F]) extends T_B[E, F]

val v_a: T_A[T_B[T_A[Char], T_B[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}