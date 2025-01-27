package Program_13 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[D, D], b: T_A[C, E], c: C) extends T_A[C, D]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, 0) => 0 
  case CC_A(_, _, 0) => 1 
  case CC_A(_, CC_A(_, _, _), 0) => 2 
  case CC_A(_, CC_A(_, _, _), _) => 3 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), 0) => 4 
  case CC_A(_, _, _) => 5 
}
}
// This is not matched: (CC_A Int Byte Boolean Wildcard Wildcard Wildcard (T_A Byte Int))
// This is not matched: (CC_C Boolean Wildcard Wildcard (T_A Boolean Int))