package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Boolean, b: T_A[D, D]) extends T_A[D, C]
case class CC_B[E, F]() extends T_A[F, E]

val v_a: CC_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_B T_B Wildcard Wildcard Wildcard (T_A T_B))