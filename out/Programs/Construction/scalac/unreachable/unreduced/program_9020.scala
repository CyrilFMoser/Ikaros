package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: Char, c: T_B[D]) extends T_A[T_B[T_A[Int, Int]], D]
case class CC_B[E]() extends T_A[E, CC_A[CC_A[E]]]
case class CC_C[F](a: F, b: T_B[F], c: CC_B[F]) extends T_A[T_B[T_A[Int, Int]], F]

val v_a: T_A[T_B[T_A[Int, Int]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _, CC_B()) => 1 
}
}