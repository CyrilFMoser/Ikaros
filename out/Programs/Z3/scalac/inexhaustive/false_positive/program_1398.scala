package Program_30 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[Char, E], b: T_A[C, C], c: T_A[E, C]) extends T_A[D, C]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_A(_, _, _) => 2 
  case CC_A(_, _, CC_A(_, _, _)) => 3 
  case CC_A(CC_A(_, _, _), _, _) => 4 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 5 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 6 
}
}
// This is not matched: (CC_A Byte Int Byte Wildcard Wildcard Wildcard (T_A Byte Int))
// This is not matched: Pattern match is empty without constants