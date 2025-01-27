package Program_15 

package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: (Boolean,(Boolean,Byte))) extends T_A[B]
case class CC_B[D](a: CC_A[D, D], b: T_A[Char], c: T_A[D]) extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(CC_A(_), _, CC_A(_)) => 1 
  case CC_B(_, CC_B(_, _, _), _) => 2 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 3 
  case CC_B(_, CC_A(_), _) => 4 
  case CC_B(CC_A(_), CC_B(_, _, _), _) => 5 
  case CC_B(_, CC_B(_, _, _), CC_A(_)) => 6 
  case CC_B(CC_A(_), _, CC_B(_, _, _)) => 7 
}
}
// This is not matched: (CC_A Char (T_A Boolean) Wildcard (T_A Char))
// This is not matched: Pattern match is empty without constants