package Program_14 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[T_B, C], c: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B[D, E](a: T_A[E, E], b: D) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
}
}
// This is not matched: (CC_B Char T_B Wildcard Wildcard (T_A (T_A Char Char) Char))
// This is not matched: (CC_A T_A)