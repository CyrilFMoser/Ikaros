package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[D, C]
case class CC_B[E, F](a: (T_B,Int), b: CC_A[F, E]) extends T_A[E, F]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: CC_B[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_B((CC_E(),_), _) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard T_A) T_A)