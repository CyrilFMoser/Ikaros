package Program_15 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: C) extends T_A[C, T_A[Byte, Byte]]

val v_a: T_A[Boolean, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard Wildcard (T_A Boolean (T_A Byte Byte)))
// This is not matched: (CC_E (T_B (CC_A (CC_B Boolean Boolean) Boolean Boolean Boolean Boolean)))