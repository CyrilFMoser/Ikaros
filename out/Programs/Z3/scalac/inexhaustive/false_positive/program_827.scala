package Program_30 

package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C, E](a: (T_B,T_B), b: T_A[D, D]) extends T_A[D, C]
case class CC_B() extends T_B

val v_a: T_A[CC_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
  case CC_A((CC_B(),CC_B()), CC_A(_, _)) => 2 
}
}
// This is not matched: (CC_A (CC_B (T_A T_B T_B))
//      T_B
//      T_B
//      Wildcard
//      Wildcard
//      (T_A (CC_B (T_A T_B T_B)) T_B))
// This is not matched: Pattern match is empty without constants