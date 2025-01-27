package Program_31 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: Boolean, b: T_B) extends T_A[B]
case class CC_B(a: T_A[T_B]) extends T_B
case class CC_C(a: T_A[Int]) extends T_B
case class CC_D(a: (T_B,CC_B)) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_C (CC_A Int T_B Boolean (CC_B Wildcard T_B) (T_A Int)) T_B)
// This is not matched: (CC_A T_A)