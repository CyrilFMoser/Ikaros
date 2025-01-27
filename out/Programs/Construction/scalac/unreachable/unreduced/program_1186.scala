package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_B[Boolean],Int), b: T_A[D, D], c: T_B[D]) extends T_A[T_B[T_B[Int]], D]
case class CC_B[E](a: T_A[Int, E], b: CC_A[CC_A[E]], c: T_B[E]) extends T_A[T_B[T_B[Int]], E]
case class CC_C[F](a: F, b: CC_A[F], c: CC_B[F]) extends T_A[T_B[T_B[Int]], F]

val v_a: T_A[T_B[T_B[Int]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _), _) => 1 
  case CC_C(_, _, _) => 2 
}
}