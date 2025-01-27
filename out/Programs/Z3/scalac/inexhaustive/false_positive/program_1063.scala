package Program_30 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[C]) extends T_A[C]
case class CC_B[E](a: E, b: T_A[E]) extends T_B[E]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_)) => 0 
}
}
// This is not matched: (CC_B Int Wildcard (CC_A Int Boolean Wildcard (T_A Int)) (T_B Int))
// This is not matched: (CC_B Byte Wildcard (CC_B Byte Wildcard Wildcard (T_A Byte)) (T_A Byte))