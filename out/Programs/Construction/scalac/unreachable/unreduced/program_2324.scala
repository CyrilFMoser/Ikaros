package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, C], b: T_B[C, C], c: C) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A[Boolean]) extends T_A
case class CC_D[D](a: D, b: Boolean) extends T_B[D, CC_C]
case class CC_E[E](a: (CC_C,CC_C)) extends T_B[E, CC_C]
case class CC_F[F](a: Int, b: T_B[F, CC_C]) extends T_B[F, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(CC_A(_, _, true)) => 1 
  case CC_C(CC_A(_, _, false)) => 2 
}
}
// This is not matched: CC_B()