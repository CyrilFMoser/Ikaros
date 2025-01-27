package Program_31 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_A) extends T_A
case class CC_B[C](a: C, b: T_A, c: T_B[C]) extends T_B[C]

val v_a: CC_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_), _) => 0 
}
}
// This is not matched: (CC_B T_A Wildcard (CC_A T_A Wildcard T_A) Wildcard (T_B T_A))
// This is not matched: (CC_B T_A Wildcard (CC_A T_A Wildcard T_A) Wildcard (T_B T_A))