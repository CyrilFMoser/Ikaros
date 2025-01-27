package Program_30 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: T_B[T_A, Char]) extends T_A
case class CC_B[C](a: CC_A) extends T_B[T_B[T_A, T_A], CC_A]

val v_a: T_B[T_B[T_A, T_A], CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_B T_A Wildcard (T_B (T_B T_A T_A) (CC_A T_A T_A T_A T_A)))
// This is not matched: (CC_C T_B Int (CC_A Int Wildcard (T_A Int Int)) Int (T_A Int T_B))