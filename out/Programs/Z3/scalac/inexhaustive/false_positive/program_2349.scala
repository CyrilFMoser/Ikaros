package Program_31 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A]) extends T_A
case class CC_B[C](a: CC_A) extends T_B[C, T_A]
case class CC_C[D](a: CC_B[CC_A], b: (T_A,T_A), c: D) extends T_B[T_B[CC_A, T_A], T_A]
case class CC_D(a: CC_A, b: T_B[(Boolean,Boolean), T_A], c: T_A) extends T_B[T_B[CC_A, T_A], T_A]

val v_a: T_B[T_B[CC_A, T_A], T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, (CC_A(_),CC_A(_)), _) => 0 
  case CC_C(CC_B(_), _, _) => 1 
  case CC_B(CC_A(_)) => 2 
  case CC_D(CC_A(_), CC_B(_), _) => 3 
  case CC_D(_, _, CC_A(_)) => 4 
  case CC_D(CC_A(_), _, _) => 5 
  case CC_D(CC_A(_), _, CC_A(_)) => 6 
  case CC_D(_, CC_B(_), _) => 7 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard (T_B (T_B (CC_A T_A T_A) T_A) T_A))
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard (T_B (T_B (CC_A T_A T_A) T_A) T_A))