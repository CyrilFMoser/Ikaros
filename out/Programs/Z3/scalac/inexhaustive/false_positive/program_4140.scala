package Program_15 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: Int) extends T_A[Boolean]
case class CC_B[B](a: CC_A) extends T_A[Boolean]
case class CC_C(a: CC_A, b: CC_B[CC_A], c: (CC_A,CC_A)) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(CC_C(_, _, _), 12) => 1 
  case CC_A(_, _) => 2 
  case CC_C(CC_A(_, _), _, _) => 3 
  case CC_C(CC_A(_, _), _, (CC_A(_, _),CC_A(_, _))) => 4 
  case CC_C(_, CC_B(_), (CC_A(_, _),CC_A(_, _))) => 5 
  case CC_C(CC_A(_, _), CC_B(_), _) => 6 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A Boolean))
// This is not matched: (CC_A Wildcard Wildcard (T_A Boolean))