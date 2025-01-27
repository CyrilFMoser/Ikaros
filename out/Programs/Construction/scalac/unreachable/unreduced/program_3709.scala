package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D], c: (T_B[Byte, Int],T_A[Char])) extends T_A[D]
case class CC_B[E](a: (T_A[Boolean],T_B[Byte, Byte])) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_B[F, T_A[F]]
case class CC_D[G](a: T_A[G], b: T_A[G], c: T_A[G]) extends T_B[T_A[G], G]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _)) => 0 
  case CC_C(CC_B(_)) => 1 
}
}