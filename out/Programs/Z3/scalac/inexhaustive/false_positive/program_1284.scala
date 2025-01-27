package Program_31 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_B[Int, Int]) extends T_A
case class CC_B[C](a: T_B[C, C], b: CC_A) extends T_A
case class CC_C[D](a: CC_A, b: D) extends T_B[D, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _), _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_C T_B T_B)