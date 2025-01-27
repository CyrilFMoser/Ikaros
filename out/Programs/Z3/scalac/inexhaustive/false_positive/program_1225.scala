package Program_31 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_B) extends T_A
case class CC_B(a: CC_A[T_B], b: T_B) extends T_B
case class CC_C(a: CC_A[Char]) extends T_B
case class CC_D(a: (CC_B,(Boolean,Boolean)), b: CC_B, c: CC_A[Int]) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_)) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_A (CC_B Wildcard T_A) Wildcard Wildcard T_A)