package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: Int, b: T_B[E, E], c: T_A[Int, E]) extends T_A[E, F]
case class CC_B[H, G]() extends T_A[H, G]
case class CC_D[K]() extends T_B[K, Boolean]

val v_a: CC_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)