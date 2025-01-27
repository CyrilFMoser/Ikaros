package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Boolean, T_A[Boolean]], b: T_A[Boolean], c: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: CC_A, b: (T_A[Boolean],CC_A)) extends T_A[Boolean]
case class CC_C(a: Int, b: T_A[Int], c: T_B[T_A[CC_A], T_A[Boolean]]) extends T_A[Boolean]
case class CC_D[E, D]() extends T_B[E, D]
case class CC_E[F](a: Char) extends T_B[CC_B, F]
case class CC_F[G]() extends T_B[CC_B, G]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, _)