package Program_15 

package Program_13 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,T_A)) extends T_A
case class CC_B[A](a: T_A, b: T_A) extends T_A
case class CC_C(a: CC_A, b: CC_B[CC_A], c: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),CC_C(_, _, _))) => 0 
  case CC_A((CC_C(_, _, _),CC_A(_))) => 1 
  case CC_A((CC_A(_),CC_A(_))) => 2 
  case CC_A((CC_C(_, _, _),CC_C(_, _, _))) => 3 
  case CC_A(_) => 4 
  case CC_A((CC_C(_, _, _),CC_B(_, _))) => 5 
  case CC_A((CC_B(_, _),CC_B(_, _))) => 6 
  case CC_A((CC_B(_, _),CC_A(_))) => 7 
  case CC_B(CC_B(_, _), CC_B(_, _)) => 8 
  case CC_B(_, _) => 9 
  case CC_C(_, _, _) => 10 
  case CC_C(_, CC_B(_, _), _) => 11 
  case CC_C(CC_A(_), CC_B(_, _), CC_A(_)) => 12 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A (Tuple (CC_C Wildcard Wildcard (CC_A (Tuple Wildcard Wildcard) T_A) T_A)
//             (CC_B (Generic "A") Wildcard (CC_A Wildcard T_A) T_A))
//      T_A)