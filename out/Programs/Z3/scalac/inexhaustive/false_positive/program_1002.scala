package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B() extends T_A[T_B[Boolean, Int], T_B[Char, Int]]
case class CC_C[E, F](a: Byte) extends T_B[E, F]

val v_a: CC_C[CC_B, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)