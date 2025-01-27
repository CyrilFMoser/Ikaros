package Program_30 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E]() extends T_A[D]
case class CC_B[F](a: T_A[F]) extends T_B[F, T_B[F, F]]

val v_a: T_B[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_B Byte (CC_A Byte Boolean (T_A Byte)) (T_B Byte (T_B Byte Byte)))
// This is not matched: Pattern match is empty without constants