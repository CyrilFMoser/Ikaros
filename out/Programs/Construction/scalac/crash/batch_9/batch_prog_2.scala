package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_A[C]) extends T_A[C]
case class CC_B[D](a: T_A[CC_A[T_A[Byte]]], b: T_A[D]) extends T_A[D]
case class CC_C[F](a: T_A[F]) extends T_B[F]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: CC_B(_, _)