package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[Int], D]
case class CC_B[E](a: T_A[E, E], b: Byte) extends T_B[E]
case class CC_C[F](a: T_B[F]) extends T_B[F]
case class CC_D() extends T_B[T_B[CC_B[Boolean]]]

val v_a: T_B[T_B[CC_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
  case CC_D() => 3 
}
}