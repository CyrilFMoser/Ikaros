package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, F], b: T_A[T_B[E, E], E]) extends T_A[E, F]
case class CC_B[G](a: G, b: T_A[G, G]) extends T_A[Boolean, G]
case class CC_C[H](a: Int, b: H) extends T_A[Boolean, H]
case class CC_D[I](a: T_A[I, I], b: T_A[Boolean, I], c: T_B[I, I]) extends T_B[I, CC_B[I]]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, CC_A(_, _))) => 1 
  case CC_B(_, CC_B(_, CC_A(_, _))) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 3 
  case CC_B(_, CC_B(_, CC_C(_, _))) => 4 
  case CC_B(_, CC_C(_, _)) => 5 
  case CC_C(12, _) => 6 
  case CC_C(_, _) => 7 
}
}