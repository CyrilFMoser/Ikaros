package Program_29 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[C, D], b: E) extends T_A[C, D]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Boolean Wildcard Wildcard (T_A Byte Boolean))
// This is not matched: (CC_B (Tuple (CC_B Wildcard Wildcard T_A) (CC_A Boolean Wildcard T_A))
//      Wildcard
//      T_A)