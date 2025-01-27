package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B() extends T_A[CC_A[Int, Byte], Byte]
case class CC_C[G](a: G) extends T_B[CC_A[CC_B, (Byte,Boolean)], G]

val v_a: CC_C[T_A[CC_A[Int, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: (CC_B (CC_B Wildcard T_A) T_A)