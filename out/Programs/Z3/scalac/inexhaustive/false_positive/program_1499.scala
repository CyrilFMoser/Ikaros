package Program_30 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[D, D], b: T_A[E, C]) extends T_A[C, D]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Byte Byte Boolean Wildcard Wildcard (T_A Byte Byte))
// This is not matched: (CC_B Byte Int Wildcard Wildcard Wildcard (T_A Byte Int))