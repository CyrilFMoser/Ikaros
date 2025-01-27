package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: Boolean, b: T_A[D], c: T_B[E, D]) extends T_A[D]
case class CC_B[F](a: F, b: T_A[F]) extends T_A[F]
case class CC_C() extends T_A[Int]
case class CC_D[G]() extends T_B[G, Int]
case class CC_E[H](a: H) extends T_B[H, Int]
case class CC_F[I](a: CC_C) extends T_B[I, Int]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, CC_A(_, _, _)), _) => 1 
  case CC_A(_, CC_B(_, CC_B(_, _)), _) => 2 
  case CC_B(_, CC_A(true, _, _)) => 3 
  case CC_B(_, CC_A(false, _, _)) => 4 
  case CC_B(_, CC_B(_, _)) => 5 
}
}