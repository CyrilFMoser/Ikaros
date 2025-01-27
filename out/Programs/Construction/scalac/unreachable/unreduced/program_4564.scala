package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_B[E, E]], b: T_A[E, T_B[E, E]], c: E) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_A[F, T_B[F, F]]) extends T_A[F, T_B[F, F]]
case class CC_C[G](a: T_A[G, Boolean], b: G, c: T_A[G, T_B[G, G]]) extends T_A[G, T_B[G, G]]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _, _), _)) => 0 
  case CC_B(CC_A(_, CC_B(_), _)) => 1 
  case CC_B(CC_A(_, CC_C(_, _, _), _)) => 2 
  case CC_B(CC_B(CC_A(_, _, _))) => 3 
  case CC_B(CC_B(CC_B(_))) => 4 
  case CC_B(CC_B(CC_C(_, _, _))) => 5 
  case CC_B(CC_C(_, _, CC_A(_, _, _))) => 6 
  case CC_B(CC_C(_, _, CC_B(_))) => 7 
  case CC_B(CC_C(_, _, CC_C(_, _, _))) => 8 
}
}