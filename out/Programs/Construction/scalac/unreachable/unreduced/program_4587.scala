package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[Int, D]
case class CC_B[E]() extends T_A[Int, E]
case class CC_C[F](a: F, b: T_B[F], c: T_B[F]) extends T_B[F]
case class CC_D[G](a: CC_B[G], b: CC_A[G], c: CC_B[G]) extends T_B[G]
case class CC_E() extends T_B[T_B[CC_C[Byte]]]

val v_a: T_B[CC_E] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_D(_, CC_A(_), CC_B()), _) => 0 
  case CC_D(_, _, CC_B()) => 1 
}
}
// This is not matched: CC_C(_, CC_C(_, _, _), _)