package Program_31 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_A) extends T_A
case class CC_B(a: T_A, b: T_B, c: CC_A[T_B]) extends T_B
case class CC_C() extends T_B
case class CC_D[B](a: B, b: B, c: B) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_A T_A Wildcard T_A)