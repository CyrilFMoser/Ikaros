package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Int]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B[C](a: T_B[C]) extends T_A[T_A[T_A[Boolean]]]
case class CC_C() extends T_A[T_A[T_A[Boolean]]]
case class CC_D[D](a: D) extends T_B[D]
case class CC_E[E](a: E) extends T_B[E]
case class CC_F[F](a: F) extends T_B[F]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()