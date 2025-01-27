package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[D, C]
case class CC_B[G, F](a: T_A[F, G]) extends T_A[F, G]

val v_a: CC_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_B Byte Boolean Wildcard Wildcard Wildcard (T_A Byte))