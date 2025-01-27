package Program_28 

package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: C, b: T_B[C, C]) extends T_A
case class CC_B[D](a: D) extends T_B[D, T_A]

val v_a: T_B[T_A, T_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_B T_A (CC_A Boolean Boolean Wildcard T_A) (T_B T_A T_A))
// This is not matched: Pattern match is empty without constants