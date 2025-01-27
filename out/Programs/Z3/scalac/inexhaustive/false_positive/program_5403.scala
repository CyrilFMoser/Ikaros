package Program_15 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[D, D], b: T_A[C, E], c: C) extends T_A[C, D]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 0 
}
}
// This is not matched: (CC_A Int Byte Byte Wildcard Wildcard Wildcard (T_A Byte Int))
// This is not matched: (CC_C Boolean Wildcard Wildcard (T_A Boolean Int))