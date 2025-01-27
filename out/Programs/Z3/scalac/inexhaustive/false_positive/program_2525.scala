package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B, b: T_B, c: (T_B,(Int,Int))) extends T_A[T_B]
case class CC_B(a: T_A[T_B]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_), CC_B(_), (CC_B(_),(_,_))) => 0 
}
}
// This is not matched: (CC_A T_B
//      Wildcard
//      (CC_B (CC_A T_B Wildcard (CC_B Wildcard T_B) Wildcard (T_A T_B)) T_B)
//      Wildcard
//      (T_A T_B))
// This is not matched: Pattern match is empty without constants