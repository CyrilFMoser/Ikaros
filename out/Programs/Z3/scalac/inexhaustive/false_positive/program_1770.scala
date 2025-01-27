package Program_29 

package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, Int], b: T_A[C, C]) extends T_A[C, (Byte,Byte)]
case class CC_B[E]() extends T_A[E, T_A[E, E]]

val v_a: T_A[Byte, (Byte,Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Byte (T_A Boolean Boolean) Wildcard Wildcard (T_A Byte (Tuple Byte Byte)))
// This is not matched: (CC_A (T_A (T_A (Tuple Int Char))))