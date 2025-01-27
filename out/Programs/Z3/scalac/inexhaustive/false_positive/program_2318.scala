package Program_30 

package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[C, E]) extends T_A[C, D]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Int Char Boolean Wildcard (T_A Int Char))
// This is not matched: (CC_C T_B)