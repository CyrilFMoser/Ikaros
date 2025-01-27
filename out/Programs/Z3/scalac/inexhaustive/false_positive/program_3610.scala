package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[E, D]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_D[I](a: CC_A[I, I], b: T_A[I, I]) extends T_B[I]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B()) => 0 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard (T_A Boolean Int))