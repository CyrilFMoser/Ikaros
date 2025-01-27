package Program_29 

package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[E, Byte], b: T_A[E, D], c: T_A[C, C]) extends T_A[C, D]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(CC_A(_, _, _), _, _) => 1 
  case CC_A(_, _, CC_A(_, _, _)) => 2 
}
}
// This is not matched: (CC_A Byte Char Byte Wildcard Wildcard Wildcard (T_A Char Byte))
// This is not matched: (CC_A (T_A (T_A Int)) (T_A (T_A (T_A Int))))