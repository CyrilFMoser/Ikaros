package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[T_B[E, E], E]) extends T_A[E, T_B[E, E]]
case class CC_B() extends T_A[Int, T_B[Int, Int]]
case class CC_C[G, F](a: T_A[F, G], b: T_A[Int, T_B[Int, Int]]) extends T_B[G, F]
case class CC_D(a: CC_C[T_B[CC_B, CC_B], Char]) extends T_B[Int, CC_B]
case class CC_E[H](a: Boolean, b: T_A[Int, T_B[Int, Int]]) extends T_B[H, Char]

val v_a: T_B[Int, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(CC_C(_, _), _)) => 0 
  case CC_C(_, CC_B()) => 1 
  case CC_D(_) => 2 
}
}