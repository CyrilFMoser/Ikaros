package Program_30 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[F, E, G](a: T_B[G, E], b: G) extends T_B[F, E]

val v_a: T_B[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
}
}
// This is not matched: (CC_B Byte Char Boolean Wildcard Wildcard (T_B Byte Char))
// This is not matched: (CC_A T_A)