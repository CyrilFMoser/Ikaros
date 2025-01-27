package Program_14 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: B, c: T_A[B]) extends T_A[B]

val v_a: CC_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), 12, CC_A(_, _, _)) => 0 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, _), _, _) => 2 
}
}
// This is not matched: (CC_A Int
//      Boolean
//      (CC_A Int Boolean Wildcard Int Wildcard (T_A Int))
//      Wildcard
//      Wildcard
//      (T_A Int))
// This is not matched: Pattern match is empty without constants