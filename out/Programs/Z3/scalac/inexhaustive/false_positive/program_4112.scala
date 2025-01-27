package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[G, F](a: T_A[F, G]) extends T_A[G, F]

val v_a: CC_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_B Byte
//      (CC_B Byte (CC_B Byte Wildcard Byte (T_A Byte)) Byte (T_A Byte))
//      Wildcard
//      (T_A Byte))