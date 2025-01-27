package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, E], b: T_A[C, D], c: D) extends T_A[D, C]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), 0) => 0 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 1 
}
}
// This is not matched: (CC_A Boolean
//      Byte
//      (T_A Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Byte Boolean))
// This is not matched: (CC_C (CC_E T_B (T_A T_B T_B))
//      (Tuple (CC_D Wildcard T_B) (CC_E Wildcard T_B))
//      Wildcard
//      (T_A Int (CC_E T_B (T_A T_B T_B))))