package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: C, b: Boolean) extends T_A
case class CC_B(a: CC_A[T_A]) extends T_A
case class CC_C[D](a: T_B[D, D], b: T_B[D, D]) extends T_B[D, Boolean]
case class CC_D[E](a: Char, b: E) extends T_B[E, Boolean]
case class CC_E[F]() extends T_B[F, Boolean]

val v_a: T_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, _) => 1 
  case CC_E() => 2 
}
}