package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[H, G](a: T_A[G, G], b: CC_A[G, G]) extends T_A[G, H]

val v_a: CC_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
}
}
// This is not matched: (CC_B Byte (T_A Byte))