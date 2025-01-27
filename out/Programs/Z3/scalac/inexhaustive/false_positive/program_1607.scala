package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte, b: T_A[D, D]) extends T_A[Char, C]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard (T_A Char Int))
// This is not matched: (CC_B Wildcard (CC_B (CC_A Wildcard T_A) Wildcard T_A) T_A)