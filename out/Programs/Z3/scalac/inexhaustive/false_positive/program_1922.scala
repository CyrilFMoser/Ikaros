package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_A[C], b: B, c: C) extends T_A[B]
case class CC_B(a: T_A[T_B]) extends T_B

val v_a: T_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_), _) => 0 
}
}
// This is not matched: (CC_A (CC_B T_B T_B) T_B Wildcard Wildcard Wildcard (T_A (CC_B T_B T_B)))
// This is not matched: (CC_B (T_A (T_A Char)))