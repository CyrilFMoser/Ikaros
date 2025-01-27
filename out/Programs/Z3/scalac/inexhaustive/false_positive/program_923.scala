package Program_30 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, E], b: T_A[C, D], c: D) extends T_A[D, C]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_A(CC_A(_, _, _), _, 0) => 2 
  case CC_A(_, CC_A(_, _, _), _) => 3 
  case CC_A(_, CC_A(_, _, _), 0) => 4 
  case CC_A(_, _, 0) => 5 
}
}
// This is not matched: (CC_A Boolean Byte Boolean Wildcard Wildcard Wildcard (T_A Byte Boolean))
// This is not matched: (CC_A Boolean Byte Boolean Wildcard Wildcard Wildcard (T_A Byte Boolean))