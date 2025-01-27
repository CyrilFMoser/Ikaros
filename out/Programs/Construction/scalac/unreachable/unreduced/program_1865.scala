package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Byte, b: T_B[T_A[Int, Boolean]]) extends T_A[T_B[T_B[Int]], T_B[T_B[Byte]]]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, CC_A]
case class CC_C[E](a: E, b: (T_B[CC_A],T_B[CC_A]), c: CC_B[E]) extends T_B[E]
case class CC_D[F](a: T_A[F, CC_A], b: T_A[F, CC_A], c: CC_A) extends T_B[F]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _, _)) => 0 
  case CC_A(_, CC_D(_, _, _)) => 1 
}
}