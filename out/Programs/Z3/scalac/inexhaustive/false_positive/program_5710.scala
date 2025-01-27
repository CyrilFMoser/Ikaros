package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, F](a: Byte) extends T_A[F, E]

val v_a: CC_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)