package Program_31 

package Program_8 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,T_A)) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: (T_A,T_A)) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),CC_B(_, _, _))) => 0 
  case CC_A((CC_B(_, _, _),CC_A(_))) => 1 
  case CC_B(CC_A(_), _, (CC_A(_),CC_B(_, _, _))) => 2 
  case CC_B(CC_A(_), _, _) => 3 
  case CC_B(_, CC_A(_), (CC_B(_, _, _),CC_A(_))) => 4 
  case CC_B(_, _, (CC_A(_),CC_A(_))) => 5 
  case CC_B(_, CC_A(_), (CC_A(_),CC_A(_))) => 6 
  case CC_B(_, _, (CC_B(_, _, _),CC_A(_))) => 7 
  case CC_B(_, _, (CC_B(_, _, _),CC_B(_, _, _))) => 8 
  case CC_B(CC_A(_), CC_A(_), (CC_B(_, _, _),CC_A(_))) => 9 
  case CC_B(_, CC_A(_), (CC_B(_, _, _),CC_B(_, _, _))) => 10 
  case CC_B(_, _, (CC_A(_),CC_B(_, _, _))) => 11 
  case CC_B(CC_A(_), CC_A(_), _) => 12 
  case CC_B(_, _, _) => 13 
  case CC_B(CC_A(_), _, (CC_B(_, _, _),CC_B(_, _, _))) => 14 
  case CC_B(CC_A(_), CC_A(_), (CC_B(_, _, _),CC_B(_, _, _))) => 16 
  case CC_B(_, CC_A(_), (CC_A(_),CC_B(_, _, _))) => 17 
}
}
// This is not matched: (CC_A (Tuple (CC_A Wildcard T_A) (CC_A (Tuple Wildcard Wildcard) T_A)) T_A)
// Mutation information: 
// Deleted Pattern CC_B(CC_A(_), _, (CC_B(_, _, _),CC_A(_))) at position 15
// This is not matched: (CC_D Wildcard T_B)