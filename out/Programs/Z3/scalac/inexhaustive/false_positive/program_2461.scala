package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: B, c: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_B) extends T_A[T_B]
case class CC_C(a: CC_A[T_B], b: T_A[T_B], c: CC_A[CC_B]) extends T_A[Char]

val v_a: CC_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_B(_)) => 0 
}
}
// This is not matched: (CC_A (T_A T_B)
//      Wildcard
//      Wildcard
//      (CC_A T_B Wildcard Wildcard Wildcard (T_A T_B))
//      (T_A T_B))
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)