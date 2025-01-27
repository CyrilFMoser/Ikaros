package Program_31 

package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: (T_A,T_A)) extends T_A
case class CC_B(a: T_A, b: (T_A,T_A)) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),CC_A(_))) => 0 
  case CC_A((CC_B(_, _),CC_A(_))) => 1 
  case CC_A((CC_A(_),CC_B(_, _))) => 2 
  case CC_A((CC_B(_, _),CC_B(_, _))) => 3 
  case CC_B(CC_A(_), (CC_B(_, _),CC_B(_, _))) => 4 
  case CC_B(_, (CC_B(_, _),CC_B(_, _))) => 5 
  case CC_B(CC_A(_), (CC_A(_),CC_B(_, _))) => 6 
  case CC_B(CC_B(_, _), (CC_B(_, _),CC_B(_, _))) => 7 
  case CC_B(_, _) => 8 
  case CC_B(CC_A(_), (CC_B(_, _),CC_A(_))) => 9 
  case CC_B(CC_A(_), (CC_A(_),CC_A(_))) => 10 
  case CC_B(CC_B(_, _), (CC_A(_),CC_A(_))) => 11 
  case CC_B(CC_B(_, _), _) => 12 
  case CC_B(CC_B(_, _), (CC_A(_),CC_B(_, _))) => 13 
  case CC_B(CC_A(_), _) => 14 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_B (CC_A Int Wildcard Wildcard Wildcard (T_A Int)) (T_A (T_A Char)))