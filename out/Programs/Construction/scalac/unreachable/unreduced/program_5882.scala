package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_B[T_A, Boolean], c: T_B[T_B[T_A, T_A], (Char,T_A)]) extends T_A
case class CC_B[C]() extends T_A
case class CC_C(a: CC_B[Byte]) extends T_A
case class CC_D[D](a: CC_B[D], b: T_B[D, T_A], c: D) extends T_B[D, T_A]
case class CC_E[E](a: T_B[E, E], b: E) extends T_B[E, T_A]
case class CC_F[F](a: F) extends T_B[F, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(CC_B())