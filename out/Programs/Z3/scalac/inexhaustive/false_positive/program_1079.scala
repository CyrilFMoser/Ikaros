package Program_30 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G](a: (Char,Byte)) extends T_A[F, E]
case class CC_B[H]() extends T_B[H, (Char,Byte)]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Byte Byte Boolean Wildcard (T_A Byte Byte))
// This is not matched: (CC_D Byte Wildcard (T_B (Tuple Char Byte) Byte))