package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[D, D]) extends T_A[D, C]
case class CC_B[F, E]() extends T_A[E, F]

val v_a: CC_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: (CC_B Byte Boolean Wildcard Wildcard Wildcard (T_A Byte))