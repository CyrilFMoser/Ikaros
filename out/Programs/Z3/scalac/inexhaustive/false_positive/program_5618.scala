package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[F, E](a: F) extends T_A[F, E]

val v_a: CC_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (T_A (T_A Char)))