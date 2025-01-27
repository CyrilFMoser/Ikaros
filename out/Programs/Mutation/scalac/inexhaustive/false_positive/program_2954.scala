package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: D, c: T_B[D, D]) extends T_A[D]
case class CC_B[E, F]() extends T_B[E, F]
case class CC_C[G, H]() extends T_B[H, G]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants