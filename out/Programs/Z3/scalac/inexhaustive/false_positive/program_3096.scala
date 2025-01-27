package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B[F]() extends T_A[F, Boolean]
case class CC_C[G]() extends T_A[G, Boolean]
case class CC_D[I, H](a: H, b: T_A[I, Boolean]) extends T_B[I, H]
case class CC_F() extends T_B[Byte, Byte]

val v_a: CC_D[CC_F, Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B()) => 0 
}
}
// This is not matched: (CC_B Wildcard Int T_A)