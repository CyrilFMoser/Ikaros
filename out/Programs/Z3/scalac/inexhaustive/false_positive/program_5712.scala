package Program_13 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B) extends T_A[T_A[T_B]]
case class CC_B(a: Char, b: T_A[T_B]) extends T_A[T_A[T_B]]
case class CC_C(a: CC_B, b: CC_B) extends T_B
case class CC_D() extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: (CC_A T_B Wildcard (T_A (T_A T_B)))
// This is not matched: (CC_A Wildcard T_A)