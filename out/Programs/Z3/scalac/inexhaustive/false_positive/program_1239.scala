package Program_30 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_B[B]) extends T_A
case class CC_B[C](a: CC_A[C], b: T_B[C]) extends T_B[C]
case class CC_C[D](a: T_B[D]) extends T_B[D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_)) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: Pattern match is empty without constants