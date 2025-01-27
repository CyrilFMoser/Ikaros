package Program_15 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E]() extends T_A[C, D]
case class CC_B[F](a: T_A[Byte, F]) extends T_A[F, T_A[F, F]]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Int Boolean (T_A Boolean Int))
// This is not matched: Pattern match is empty without constants