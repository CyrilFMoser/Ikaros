package Program_30 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B, b: T_B, c: (T_B,(Int,Int))) extends T_A[T_B]
case class CC_B(a: T_A[T_B]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_), _, (CC_B(_),(_,_))) => 0 
  case CC_A(CC_B(_), _, _) => 1 
  case CC_A(_, _, (CC_B(_),(_,_))) => 2 
}
}
// This is not matched: (CC_A T_B Wildcard Wildcard Wildcard (T_A T_B))
// This is not matched: (CC_A T_B Wildcard Wildcard Wildcard (T_A T_B))