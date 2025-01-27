package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, F](a: F) extends T_A[F, E]

val v_a: CC_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_B Boolean Boolean Boolean (T_A Boolean Boolean))