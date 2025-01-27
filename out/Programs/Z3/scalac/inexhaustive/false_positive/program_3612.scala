package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_B[F, E](a: Byte) extends T_A[E, F]

val v_a: CC_B[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard (T_A Boolean Int))