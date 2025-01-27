package Program_14 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_A[C]) extends T_A[C]
case class CC_B[D, E](a: T_B[E]) extends T_B[D]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_B Char Boolean Wildcard (T_B Char))
// This is not matched: (CC_A T_A Wildcard T_A)