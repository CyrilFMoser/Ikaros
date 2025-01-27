package Program_30 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, Byte], b: T_A[C, Byte], c: C) extends T_A[C, Byte]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 1 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), 0) => 2 
  case CC_A(_, _, _) => 3 
  case CC_A(_, _, 0) => 4 
  case CC_A(CC_A(_, _, _), _, 0) => 5 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard Wildcard (T_A Byte Byte))
// This is not matched: (CC_C Int Wildcard Wildcard (T_A Int Byte))