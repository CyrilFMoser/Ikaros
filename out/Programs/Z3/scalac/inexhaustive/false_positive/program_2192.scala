package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, E]]
case class CC_C[H, G](a: T_A[G, H], b: Byte) extends T_B[H, G]

val v_a: T_B[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_C(_, 0) => 0 
}
}
// This is not matched: (CC_B Byte Wildcard (CC_D Byte Byte Wildcard (T_B Byte Byte)) (T_A Byte))