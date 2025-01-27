package Program_29 

package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: (Byte,(Int,Boolean))) extends T_A[B]
case class CC_B[D](a: T_A[D], b: T_A[D], c: CC_A[D, D]) extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_), _) => 1 
  case CC_B(CC_A(_), CC_B(_, _, _), _) => 2 
  case CC_B(CC_A(_), _, _) => 3 
  case CC_B(CC_B(_, _, _), _, CC_A(_)) => 4 
  case CC_B(_, CC_B(_, _, _), _) => 5 
  case CC_B(_, _, _) => 6 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_A(_)) => 7 
  case CC_B(_, _, CC_A(_)) => 8 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A Boolean))