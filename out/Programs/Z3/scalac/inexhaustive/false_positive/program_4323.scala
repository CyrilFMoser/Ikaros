package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F](a: Int) extends T_A[F, E]

val v_a: CC_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (Tuple Boolean Byte)))