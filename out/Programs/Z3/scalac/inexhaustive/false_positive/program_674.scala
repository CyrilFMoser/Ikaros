package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char, b: T_B[D, D]) extends T_A[D]
case class CC_C[F]() extends T_B[CC_A[Byte], F]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
}
}
// This is not matched: (CC_A (T_A Boolean))