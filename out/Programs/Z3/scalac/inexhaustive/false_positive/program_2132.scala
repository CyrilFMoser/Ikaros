package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: Char, c: T_B[D, D]) extends T_A[D]
case class CC_B[F, E]() extends T_B[E, F]
case class CC_C[H, G, I](a: Char, b: CC_A[I]) extends T_B[H, G]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _), _, CC_B()) => 0 
  case CC_A(CC_B(), _, CC_B()) => 1 
  case CC_A(CC_B(), 'x', _) => 2 
  case CC_A(_, _, CC_B()) => 3 
  case CC_A(CC_C(_, _), 'x', CC_C(_, _)) => 4 
  case CC_A(_, _, CC_C(_, _)) => 5 
}
}
// This is not matched: (CC_A Byte
//      Wildcard
//      Wildcard
//      (CC_C Byte Byte Boolean Char Wildcard (T_B Byte Byte))
//      (T_A Byte))
// This is not matched: (CC_D T_B T_B)