package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C]) extends T_A[B]
case class CC_B[D](a: T_A[D], b: T_A[D], c: T_A[D]) extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_B(_, _, _)) => 1 
  case CC_B(_, CC_B(_, _, _), CC_A(_)) => 2 
  case CC_B(_, _, _) => 3 
  case CC_B(_, _, CC_A(_)) => 4 
}
}
// This is not matched: (CC_A Boolean (CC_A Boolean Boolean Boolean Boolean) Wildcard (T_A Boolean))
// This is not matched: Pattern match is empty without constants