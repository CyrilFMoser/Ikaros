package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: T_A[T_B[Boolean]]) extends T_A[T_B[Boolean]]
case class CC_B(a: Boolean, b: T_B[CC_A], c: T_A[T_B[Boolean]]) extends T_A[T_B[Boolean]]
case class CC_C() extends T_A[T_B[Boolean]]
case class CC_D[C, D]() extends T_B[C]
case class CC_E[E](a: T_A[E], b: E, c: T_B[E]) extends T_B[E]
case class CC_F[F]() extends T_B[F]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _, _) => 1 
  case CC_F() => 2 
}
}