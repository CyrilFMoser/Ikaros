package Program_31 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_B[T_A, T_A]) extends T_A
case class CC_B[C](a: T_B[C, C], b: T_A, c: T_A) extends T_A
case class CC_C[D](a: (CC_A,T_A), b: T_B[D, D], c: CC_B[D]) extends T_B[D, T_B[D, D]]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
}
}
// This is not matched: (CC_B Byte Wildcard Wildcard (CC_A Wildcard Wildcard T_A) T_A)
// This is not matched: Pattern match is empty without constants