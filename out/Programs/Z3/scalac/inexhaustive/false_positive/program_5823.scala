package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, Int]
case class CC_C[F]() extends T_B[F]
case class CC_D[G]() extends T_B[G]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
}
}
// This is not matched: (CC_B (CC_B Wildcard T_A) T_A)