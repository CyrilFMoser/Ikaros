package Program_30 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[C, D], b: T_B, c: T_B) extends T_A[D, C]
case class CC_B[E](a: E) extends T_B

val v_a: CC_B[T_B] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_B T_B (CC_B Boolean Boolean T_B) T_B)
// This is not matched: (CC_B Int Wildcard (CC_B Int Int Wildcard (T_A Int)) (T_A Int))